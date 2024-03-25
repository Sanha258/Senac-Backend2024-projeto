package controller;


import exeption.vacinacaoException;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import model.entity.Pais;

import service.PaisService;

@Path("/pais")
public class PaisController {
	
	private PaisService service = new PaisService();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Pais inserir (Pais novoPais) throws vacinacaoException{
		 return service.inserir(novoPais);
	}
	

}
