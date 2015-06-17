import java.io.IOException;
import java.sql.SQLException;

import metier.ClientsMetier;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Image {

	public static void main(String[] args) throws IOException, SQLException {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
		//VilleMetier v = (VilleMetier) context.getBean("VilleMetier");
	
		ClientsMetier v = (ClientsMetier) context.getBean("ClientsMetier");
		
		//v.imageClients(1, "image", "C:\\Users\\oussama\\Desktop");
		
		System.out.println("image bien extraite");
		
		

	}

}
