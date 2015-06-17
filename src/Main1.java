import java.util.Iterator;
import java.util.List;

import metier.ClientsMetier;
import model.Clients;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
		//VilleMetier v = (VilleMetier) context.getBean("VilleMetier");
	
		ClientsMetier v = (ClientsMetier) context.getBean("ClientsMetier");
		
		/*
		List<Clients> l = v.getallClientss();
		
		Iterator itr = l.iterator();
		
		
		while(itr.hasNext()){
			   Object[] obj = (Object[]) itr.next();
			   //now you have one array of Object for each row
			   Integer id= Integer.parseInt(String.valueOf(obj[0]));
			   String nom = String.valueOf(obj[1]);
			   String prenom = String.valueOf(obj[2]);
			   String language = String.valueOf(obj[3]); 
			   String ville = String.valueOf(obj[4]); 
			   String dateNaissance = String.valueOf(obj[5]);
			    String numMobile= String.valueOf(obj[6]);
	            String numFix= String.valueOf(obj[7]);        
	            String email= String.valueOf(obj[8]);
	           Integer compteCourant= Integer.parseInt(String.valueOf(obj[9]));
	           Integer compteEpargne=Integer.parseInt(String.valueOf(obj[10]));
	           
	           Float salaireMensuel= Float.parseFloat(String.valueOf(obj[11]));
	      	 Float dernierSalairee= Float.parseFloat(String.valueOf(obj[12]));
	           
			   //Integer service = Integer.parseInt(String.valueOf(obj[1])); //SERVICE assumed as int
			   //same way for all obj[2], obj[3], obj[4]
			   
			   System.out.println(id+" "+nom +"  "+prenom+" "+language+" "+ville+"  "+dateNaissance +"  "+numMobile
					   +" "+numFix+" "+email+ " "+compteCourant+" "+compteCourant+" "+compteEpargne+ " ") ;
			}   */
		/*
     Clients l = (Clients)v.getClientsbyid(1);
     System.out.println(l.getIdClient());
		
			   System.out.println(l.getIdClient()+" "+l.getNom() +"  "+l.getPrenom()+" "+l.getDateNaissance()+" "+l.getVille()+"  "+"  "+l.getNumMobile()
					   +" "+l.getNumFix()+" "+l.getEmail()+ " "+l.getCompteCourant()+" "+" "+l.getCompteEpargne()+ " ") ;
			*/
		
     List<Clients> l = v.getClientsbyid(1);
    
		
		Iterator itr = l.iterator();
		
		
		while(itr.hasNext()){
			   Object[] obj = (Object[]) itr.next();
			   //now you have one array of Object for each row
			   Integer id= Integer.parseInt(String.valueOf(obj[0]));
			   String nom = String.valueOf(obj[1]);
			   String prenom = String.valueOf(obj[2]);
			   String language = String.valueOf(obj[3]); 
			   String ville = String.valueOf(obj[4]); 
			   String dateNaissance = String.valueOf(obj[5]);
			    String numMobile= String.valueOf(obj[6]);
	            String numFix= String.valueOf(obj[7]);        
	            String email= String.valueOf(obj[8]);
	           Integer compteCourant= Integer.parseInt(String.valueOf(obj[9]));
	           Integer compteEpargne=Integer.parseInt(String.valueOf(obj[10]));
	           
	           Float salaireMensuel= Float.parseFloat(String.valueOf(obj[11]));
	      	 Float dernierSalairee= Float.parseFloat(String.valueOf(obj[12]));
	           
			   //Integer service = Integer.parseInt(String.valueOf(obj[1])); //SERVICE assumed as int
			   //same way for all obj[2], obj[3], obj[4]
			   
			   System.out.println(id+" "+nom +"  "+prenom+" "+language+" "+ville+"  "+dateNaissance +"  "+numMobile
					   +" "+numFix+" "+email+ " "+compteCourant+" "+compteCourant+" "+compteEpargne+ " ") ;
			}   
		
		}
}
