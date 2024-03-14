package controller;

import java.util.List;

import exeption.ControleVacinasException;
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
import service.PessoaBO;



@Path("/pessoa")
public class PessoaREST {
	
	@POST
	//@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Pessoa cadastrarPessoa(Pessoa pessoa) throws ControleVacinasException {
		PessoaBO pessoaBO = new PessoaBO();
		return pessoaBO.cadastrarPessoaBO(pessoa);
	}
	
	@PUT
	//@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean atualizarPessoa (Pessoa pessoa) {
		PessoaBO pessoaBO = new PessoaBO();
		return pessoaBO.atualizarPessoaBO(pessoa);
	}
	
	@GET
	@Path("/listar/{idPessoa}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pessoa> consultarTodasPessoas(@PathParam("idPessoa") int idPessoa) {
		PessoaBO pessoaBO = new PessoaBO();
		return pessoaBO.consultarTodasPessoasBO(idPessoa);
	}
	
	/*@GET
	@Path("/pesquisar/{idPessoa}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Pessoa consultarPessoa(@PathParam("idPessoa") int idPessoa) {
		PessoaBO pessoaBO = new PessoaBO();
		return pessoaBO.consultarTodasPessoasBO(idPessoa);*/
	
	

	
	@DELETE
	@Path("/excluir")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean excluirPessoa(Pessoa pessoa) {
		PessoaBO pessoaBO = new PessoaBO();
		return pessoaBO.excluirPessoaBO(pessoa);
	}


}
