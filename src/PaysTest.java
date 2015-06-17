import java.util.Iterator;
import java.util.List;

import metier.PaysMetier;
import model.Pays;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PaysTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
		PaysMetier met = (PaysMetier) context.getBean("PaysMetier");
	
	  List<Pays> l = met.getallPayss();
	  
	  
	  //System.out.println(l.get(0));
	  
	  Iterator itr = l.iterator();
		
	  while(itr.hasNext()){

		  String nom = String.valueOf(itr.next());
		 
		 
		 System.out.println(nom +" ");
		   
	  }

	}

}
