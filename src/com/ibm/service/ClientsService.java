package com.ibm.service;


import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import metier.ClientsMetier;
import model.Clients;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/ClientsService")
public class ClientsService {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
	ClientsMetier met = (ClientsMetier) context.getBean("ClientsMetier");

	@GET
	@Path("/Clients")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Clients> getallClients() {
		return met.getallClientss();
	}

	@GET
	@Path("/Clients/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Clients> getClientbyid(@PathParam(value = "id") int id) {
		return met.getClientsbyid(id);
	}

	@GET
	@Path("/supprime/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id) {
		 met.deleteClients(id);
		 return "bien supprim�";
	}
	
	@GET
	@Path("/update/{id}/{ville}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateClient(@PathParam(value = "id") int id,@PathParam(value = "ville") String ville ) {
		//Clients c = met.getClientsbyid(id);
		//c.setVille(ville);
		// met.updateClients(c);
		 return "update reussie";
	}
		
	@POST
	@Path("/Client")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String addClient(@FormParam(value="id")int id,@FormParam(value="firstName")String firstName,@FormParam(value="ville")int ville,@FormParam(value="nationality")int nationality,@FormParam(value="lastName")String lastName,@FormParam(value="date_naissance")String date_naissance,@FormParam(value="mobile")String mobile,@FormParam(value="fix")String fix,@FormParam(value="email")String email,@FormParam(value="compte_courant")int compte_courant,@FormParam(value="compte_epargne")int compte_epargne,@FormParam(value="salaire_mensuel")Float salaire_mensuel,@FormParam(value="dernier_salaire")Float dernier_salaire){
		//Clients cc = new Clients(id, firstName, lastName,date_naissance,mobile,fix,email,compte_courant,compte_epargne,salaire_mensuel,dernier_salaire,photo,document);
		//Clients  c = new Clients(id, ville, nationality,firstName, lastName,date_naissance,mobile,fix,email,compte_courant,compte_epargne,salaire_mensuel,dernier_salaire);
		//met.addClients(cc);
     
	//return Response.status(200).entity(met.getallbooks().get(1).getAuteur()).build();
		return "Client  Ajouter";
	}
	
	@GET
	@Path("/Clients/image/{id}/{nom}")
	@Produces(MediaType.APPLICATION_JSON)
	public void imageClients(@PathParam(value = "id") int id,@PathParam(value = "nom") String nom) throws IOException, SQLException {
		
		String a = new File("").getAbsolutePath();
		String b=a+"\\photosClients";
    	File dir = new File (b);
    	dir.mkdirs();
		 met.imageClients(id, nom, b);
	    	System.out.println(b);
		 System.out.println("image bien enregisré");
	
		// picture po = new picture();
		  //po.draw(b);
	
		  return ;
			
	}
	
}
