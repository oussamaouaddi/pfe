package dao;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.imageio.ImageIO;

import model.Clients;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class ClientsImp implements IdaoClients {

	@Override
	public List<Clients> getallClients() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("SELECT C.idClient , C.nom , C.prenom,C.langue.nom , C.ville.name,C.dateNaissance,C.numMobile, C.numFix,C.email,C.compteCourant,C.compteEpargne,C.salaireMensuel,C.dernierSalairee    FROM Clients C ");		
		List<Clients> l = query.list();
		tx.commit();
		session.close();		
		return l;
	}

	@Override
	public List<Clients> getClientsbyid(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("SELECT C.idClient , C.nom , C.prenom,C.langue.nom , C.ville.name,C.dateNaissance,C.numMobile, C.numFix,C.email,C.compteCourant,C.compteEpargne,C.salaireMensuel,C.dernierSalairee    FROM Clients C where id=?");
		query.setParameter(0,id);
		List<Clients> l1 =  query.list();
		tx.commit();
		session.close();	
		return l1;
	}

	@Override
	public void addClients(Clients c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();	

	}
	
	public void deleteClients(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Clients cl = (Clients) session.get(Clients.class, id);
		if (null != cl) {
			session.delete(cl);
			
		}
		tx.commit();
		session.close();	
			}
	
	public void updateClients(Clients c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
	    session.update(c);
		tx.commit();
		session.close();	
			}

	@Override
	
	/*
public void imageClients(int i ,String nom) throws IOException, SQLException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("SELECT  C.photo  FROM Clients C where id=?");

 //String destination = chemin +".jpg";
		                         
	// String destination =  nom + ".jpg";
		   //File file = new File(destination);

		query.setParameter(0,i);
		List l =  query.list();
		
		byte[] bytes = (byte[]) l.get(0);
			
		Blob blob = Hibernate.createBlob(bytes);
			 BufferedImage image = ImageIO.read(blob.getBinaryStream());
		      OutputStream stream = new ;
		      ImageIO.write(image,"jpg",stream);  
		
		 stream.close();
		 tx.commit();
			session.close();
			
			   System.out.println("bien extrait");
	}  */
	
	public void imageClients(int i ,String nom,String chemin) throws IOException, SQLException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("SELECT  C.photo  FROM Clients C where id=?");

 //String destination = chemin ;
		                         
		   String destination = chemin + System.getProperty("file.separator")
                   + nom + ".jpg";		
		   File file = new File(destination);

		query.setParameter(0,i);
		List l =  query.list();
		
		byte[] bytes = (byte[]) l.get(0);
			
		Blob blob = Hibernate.createBlob(bytes);
			 BufferedImage image = ImageIO.read(blob.getBinaryStream());
		     FileOutputStream stream = new FileOutputStream(file);
		      ImageIO.write(image,"jpg",stream);  
		
		 stream.close();
		 tx.commit();
			session.close();
			
			   System.out.println("bien extrait");
			   
			   
			   

	}

	@Override
	public void DocumentsClients(int i) {
		// TODO Auto-generated method stub
		
	}

	



}
