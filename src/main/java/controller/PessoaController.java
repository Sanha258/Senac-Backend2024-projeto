package controller;

import java.util.List;

import exeption.vacinacaoException;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import model.entity.Pessoa;
import service.PessoaService;



@Path("/pessoa")
public class PessoaController {
	
private PessoaService service = new PessoaService();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Pessoa salvar(Pessoa novaPessoa) throws vacinacaoException{
		 return service.salvar(novaPessoa);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public boolean atualizar(Pessoa pessoaEditada) throws vacinacaoException{
		 return service.atualizar(pessoaEditada);
	}
	
	@GET
	@Path("/{id}")
	public Pessoa consultarPorId(@PathParam("id") int id){
		 return service.consultarPorId(id);
	}
	
	@GET
	@Path("/todas")
	public List<Pessoa> consultarTodas(){
		 return service.consultarTodas();
	}
	

	@DELETE
	@Path("/{id}")
	public boolean excluir(@PathParam("id") int id){
		 return service.excluir(id);
	}
	

}
