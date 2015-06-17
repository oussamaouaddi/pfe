package dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import model.Pays;
import model.Ville;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class PaysImp implements IdaoPays {

	@Override
	public List<Pays> getallPays() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery(" select P.name from Pays  P");		
		List<Pays> l = query.list();
		tx.commit();
		session.close();		
		return l;
	}

	@Override
	public List<Pays> getPaysbyid(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery(" select P.name from Pays  P where id=?");
		query.setParameter(0,id);
		List<Pays> l1 =  query.list();
		tx.commit();
		session.close();	
		return l1;
	}

	@Override
	public void addPays(Pays c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();	

	}
	
	public void deletePays(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Pays cl = (Pays) session.get(Pays.class, id);
		if (null != cl) {
			session.delete(cl);
			
		}
		tx.commit();
		session.close();	
			}
	
	public void updatePays(Pays c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
	    session.update(c);
		tx.commit();
		session.close();	
			}

	@Override
	public Set<Ville> getAllVille(int id) {
		
		/*
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Pays p = (Pays) session.get(Pays.class, id);
		
		Set<Ville>  s=p.getVilles();
		
		Set<String> ss = null;
		
		for(Ville v : s){
			
			System.out.println(v.getName());
			ss.add(v.getName());
			
		}
		
		return ss;  */
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		/*
		Query query  = session.createQuery(" select P.villes from Pays  P where P.id=?");		
		query.setParameter(0,id);
		List<Ville> l = query.list();
		
		Set<Ville> s = new HashSet<>(l);
		
		Iterator<Ville> it= s.iterator();
		
		Set<String> ss = null;
		
		  while(it.hasNext()){
			  
			System.out.println(  it.next().getName()  );
			ss.add(it.next().getName());
			  
		  }
		
		tx.commit();
		session.close();		
		return ss;    */
		Pays cl1 = (Pays) session.get(Pays.class, id);
		Set<Ville>  s= cl1.getVilles();   
    
		
		return s;
		
	
	}



}
