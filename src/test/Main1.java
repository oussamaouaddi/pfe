package test;
import java.sql.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import metier.CreditImmobilierMetier;
import model.CreditImmobilier;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
		//VilleMetier v = (VilleMetier) context.getBean("VilleMetier");
	
		//ClientsMetier v = (ClientsMetier) context.getBean("ClientsMetier");
		CreditImmobilierMetier v = (CreditImmobilierMetier) context.getBean("CreditImmobilierMetier");

		List<CreditImmobilier> l = v.getallCreditImmobiliers();
		
		System.out.println(l.size());
		
		Format formatter = new SimpleDateFormat("yyyy-MM-dd ");
		
   Iterator itr = l.iterator();
		
		
		while(itr.hasNext()){
			   Object[] obj = (Object[]) itr.next();
			   //now you have one array of Object for each row
			   String  typeImmeuble= String.valueOf(obj[0]);
			   String  typetypeRedisence= String.valueOf(obj[1]);
               String existence = String.valueOf(obj[2]);
               String agent_prenom = String.valueOf(obj[3]); 
               String agent_nom = String.valueOf(obj[4]); 
               String clients = String.valueOf(obj[5]);
                Float tauxInteret= Float.parseFloat(String.valueOf(obj[6]));
                Float montantPret= Float.parseFloat(String.valueOf(obj[7]));   
              
                String dateOrigine= formatter.format(obj[8]);
                
                
                String echance= formatter.format(obj[9]);               
               
               
               Float mensualite=Float.parseFloat(String.valueOf(obj[10]));
            Float residencePrimaire= Float.parseFloat(String.valueOf(obj[11]));
             Float surfaceTerre= Float.parseFloat(String.valueOf(obj[12]));
             Integer surfaceConstruction= Integer.parseInt(String.valueOf(obj[13]));
               String entrepreneurConstruction=String.valueOf(obj[14]);
            Float estimationConstruction= Float.parseFloat(String.valueOf(obj[15]));
             Float estimationPropriete= Float.parseFloat(String.valueOf(obj[16]));
	           
			   //Integer service = Integer.parseInt(String.valueOf(obj[1])); //SERVICE assumed as int
			   //same way for all obj[2], obj[3], obj[4]
			   
			   System.out.println(typeImmeuble+" "+typetypeRedisence+" "+existence+" "+agent_prenom+"  "+agent_nom +"  "+clients
					   +" "+tauxInteret+" "+montantPret+ " "+montantPret+" "+dateOrigine+" "+echance+ " "+mensualite+" "+residencePrimaire+" "+surfaceTerre+ " "+surfaceConstruction+ " "+entrepreneurConstruction+" "+estimationConstruction+" "+estimationPropriete+ " ") ;
			}   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		//Ville b = v.getVillebyid(1) ;
		/*b.setVille("paris");
		met.updateClient(b);
		met.deleteClient(14);  */ 
		//System.out.println(b.getName()); 
		}
}
