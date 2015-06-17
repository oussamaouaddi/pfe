package test;
import java.util.Iterator;
import java.util.Set;

import metier.PaysMetier;
import model.Ville;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mainville {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
		PaysMetier v = (PaysMetier) context.getBean("PaysMetier");
		
		try {
			Set<Ville> s = v.getAllVille(1);
			Iterator<Ville> it= s.iterator();
			
			  while(it.hasNext()){
				  
				System.out.println(  it.next().getName()  );
				  
			  }  
			
			/*
			Set s = v.getAllVille(1);
			
			Iterator<Ville> it= s.iterator();
			
			  while(it.hasNext()){
				  
				System.out.println(  it.next().getName()  );
				  
			  }   */
			
			
		} catch (Exception e) {
			System.out.println("le id n'existe pas dans la base");
			e.printStackTrace();
		}

		
		
		
	
		//Ville b = v.getVillebyid(2) ;
		//b.setName("dakhla");;
		//v.updateVille(b);
		/*  met.deleteClient(14);  */ 
		/*
		System.out.println(b.getName()); 
		
		System.out.println("------------------------------");

		Pays p1 = b.getPays();
		
		System.out.println(p1.getName());
		
		System.out.println("---------- finished--------------------");
  */
		//System.out.println(p1);
		//int k = b.getPays().getIdPays();
		
		//Pays p = v.getPaysByVille(k);
		//System.out.println( " "+p.getName());
		
		
		
		
		}
}
