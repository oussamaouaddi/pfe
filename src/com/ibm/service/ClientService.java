package com.ibm.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.Metier;
import model.Client;

import java.util.List;

@Path("/Service")
public class ClientService {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
	Metier met = (Metier) context.getBean("metier");

	@GET
	@Path("/Clients")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Client> getallClients() {
		return met.getallClients();
	}

	@GET
	@Path("/Clients/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Client getClientbyid(@PathParam(value = "id") int id) {
		return met.getClientbyid(id);
	}

	@GET
	@Path("/supprime/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id) {
		 met.deleteClient(id);
		 return "bien supprimé";
	}
	
	@GET
	@Path("/update/{id}/{ville}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id,@PathParam(value = "ville") String ville ) {
		Client c = met.getClientbyid(id);
		c.setVille(ville);
		 met.updateClient(c);
		 return "update reussie";
	}
		
	@POST
	@Path("/Clients")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String addBook(@FormParam(value="id")int id,@FormParam(value="firstName")String firstName,@FormParam(value="lastName")String lastName,@FormParam(value="nationality")String nationality){
	
		Client  c = new Client(id, firstName, lastName, nationality);
		met.addClient(c);
     
	//return Response.status(200).entity(met.getallbooks().get(1).getAuteur()).build();
		return "Client  Ajouter";
	}
	
	
	
}
