package test;
import metier.Metier;
import model.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
		Metier met = (Metier) context.getBean("metier");
	
		Client b = met.getClientbyid(8);
		b.setVille("paris");
		met.updateClient(b);
		met.deleteClient(14);
		System.out.println(met.getClientbyid(2).getLastName());
		}
}
