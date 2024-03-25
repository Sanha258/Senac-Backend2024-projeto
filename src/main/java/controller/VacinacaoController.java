package controller;


import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import model.entity.Vacina;
import model.entity.Vacinacao;
import service.VacinacaoService;

@Path("/vacinacao")
public class VacinacaoController {
	
	private VacinacaoService service = new VacinacaoService();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Vacinacao inserir(Vacinacao novaVacinacao){
		 return service.inserir(novaVacinacao);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public boolean atualizar(Vacinacao vacinacao){
		 return service.atualizar(vacinacao);
	}
	
	@DELETE
	@Path("/{id}")
	public boolean excluir(@PathParam("id") int id){
		 return service.excluir(id);
	}
	
	@GET
	@Path("/{id}")
	public Vacinacao consultarPorId(@PathParam("id") int id){
		 return service.consultarPorId(id);
	}
	
	@GET
	@Path("/todas")
	public ArrayList<Vacinacao> consultarTodas(){
		 return service.consultarTodas();
	}
	
	@GET
	@Path("/todas")
	public ArrayList<Vacinacao> consultarPorIdPessoa(@PathParam("id") int id){
		 return service.consultarPorIdPessoa(id);
	}
	
}
