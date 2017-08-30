package com.gtm.demorest.service.rest;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.gtm.demorest.domaine.Employe;


@Path("/json")

public class JasonService {
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Employe getTrackInJSON() {

		Employe employe = new Employe();
		employe.setNom("BUREL");
		employe.setPrenom("Sebastien");

		return employe;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Employe employe) {

		String result = "Track saved : " + employe;
		return Response.status(201).entity(result).build();
		
	}
	
}

