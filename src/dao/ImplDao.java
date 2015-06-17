package dao;

import java.util.List;

import model.Client;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class ImplDao implements Idao {

	@Override
	public List<Client> getallClient() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from Client");		
		List<Client> l = query.list();
		tx.commit();
		session.close();		
		return l;
	}

	@Override
	public Client getClientbyid(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from Client where id=?");
		query.setParameter(0,id);
		List<Client> l =  query.list();
		
		tx.commit();
		session.close();	
		return l.get(0);
	}

	@Override
	public void addClient(Client c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();	

	}
	
	public void deleteClient(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Client cl = (Client) session.get(Client.class, id);
		if (null != cl) {
			session.delete(cl);
			
		}
		tx.commit();
		session.close();	
			}
	
	public void updateClient(Client c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
	    session.update(c);
		tx.commit();
		session.close();	
			}



}
