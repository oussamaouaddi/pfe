package com.ibm.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import metier.PaysMetier;
import model.Pays;
import model.Ville;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/PaysService")

public class PaysService {
	
	

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("util/Config.xml");
	PaysMetier met = (PaysMetier) context.getBean("PaysMetier");

	@GET
	@Path("/Pays")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pays> getallPays() {
		return met.getallPayss();
	}

	@GET
	@Path("/Pays/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pays> getPaysbyid(@PathParam(value = "id") int id) {
		return met.getPaysbyid(id);
	}
	
	@GET
	@Path("/Pays/{id}/villes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getVillePaysbyid(@PathParam(value = "id") int id) {
	//	return met.getAllVille(id);
		
		List mylist = new ArrayList<>();
		try {
			Set<Ville> s = met.getAllVille(id);
			Iterator<Ville> it= s.iterator();
			
			
			
			  while(it.hasNext()){
				  
				System.out.println(  it.next().getName()  );
				mylist.add(it.next().getName() );
				  
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

		return mylist;
	}


	@GET
	@Path("/supprime/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id) {
		 met.deletePays(id);
		 return "bien supprimé";
	}
	
	@GET
	@Path("/update/{id}/{ville}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteClient(@PathParam(value = "id") int id,@PathParam(value = "ville") String ville ) {
		//Pays c = met.getPaysbyid(id);
		//c.setVille(ville);
		// met.updatePays(c);
		 return "update reussie";
	}
		
	@POST
	@Path("/Pays")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String addBook(@FormParam(value="id")int id,@FormParam(value="firstName")String firstName,@FormParam(value="lastName")String lastName,@FormParam(value="nationality")String nationality){
	
		//Client  c = new Client(id, firstName, lastName, nationality);
		//met.addPays(c);
     
	//return Response.status(200).entity(met.getallbooks().get(1).getAuteur()).build();
		return "Client  Ajouter";
	}
	
	
	
}
