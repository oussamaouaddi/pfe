import java.io.File;
import java.util.Iterator;
import java.util.List;

import metier.VilleMetier;
import model.Ville;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
		//Metier met = (Metier) context.getBean("metier");  
	
	
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
		VilleMetier met = (VilleMetier) context.getBean("VilleMetier");
	
	  List<Ville> l = met.getallVilles();
	  
	  
	  //System.out.println(l.get(0));
	  
	  Iterator itr = l.iterator();
		
	  while(itr.hasNext()){
		  
		   Object[] obj = (Object[]) itr.next();
		  
		  String nom = String.valueOf(obj[0]);
		   String pays = String.valueOf(obj[1]);
		 
		 System.out.println(nom +" "+pays);
		   
	  }

		   
		
	/*
		Client b = met.getClientbyid(8);
		b.setVille("paris");
		met.updateClient(b);
		met.deleteClient(14);
		System.out.println(met.getClientbyid(2).getLastName());   */
		
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
		//PaysMetier met = (PaysMetier) context.getBean("PaysMetier");
		
		
		
		
		
		String path=new File("").getAbsolutePath(); 
		   System.out.println(path);
		}
}
