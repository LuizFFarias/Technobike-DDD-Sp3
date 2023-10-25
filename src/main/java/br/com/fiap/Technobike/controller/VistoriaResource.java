package br.com.fiap.Technobike.controller;


import java.util.ArrayList;

import br.com.fiap.Technobike.model.entity.ChallengeVistoria;
import br.com.fiap.Technobike.model.repository.VistoriaRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;

@Path("/Technobike")
public class VistoriaResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() {
		ArrayList<ChallengeVistoria> resposta = VistoriaRepository.findAll();
		ResponseBuilder response = Response.ok();
		response.entity(resposta);
		return response.build();
	}

}
