package service;

import java.util.List;

import exeption.ControleVacinasException;
import model.entity.Pessoa;
import model.repository.PessoaDAO;


public class PessoaBO {
	
	public Pessoa cadastrarPessoaBO(Pessoa pessoa) throws ControleVacinasException {
		PessoaDAO pessoaDAO = new PessoaDAO();
		if (((List<Pessoa>) pessoaDAO).isEmpty()) {
            throw new ControleVacinasException("Todos os campos são obrigatórios.");
        } else {
        	pessoa = pessoaDAO.cadastrarPessoaDAO(pessoa);
        }
		return pessoa ;
	}
	
	public List<Pessoa> consultarTodasPessoasBO(int idPessoa){
		PessoaDAO pessoaDAO = new PessoaDAO();
		return pessoaDAO.consultarTodasPessoasDAO(idPessoa);
	}
	
	
	public boolean atualizarPessoaBO(Pessoa pessoa) {
		PessoaDAO pessoaDAO = new PessoaDAO();
		return pessoaDAO.atualizarPessoaDAO(pessoa);
	}
	
	public boolean excluirPessoaBO(Pessoa pessoa) {
		PessoaDAO pessoaDAO = new PessoaDAO();
		return pessoaDAO.excluirPessoaDAO(pessoa);
	}


}
