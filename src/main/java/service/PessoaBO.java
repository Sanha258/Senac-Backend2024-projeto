package service;

import java.util.List;

import exeption.ControleVacinasException;
import model.entity.Pessoa;
import model.repository.PessoaDAO;


public class PessoaBO {
	
	PessoaDAO pessoaDAO = new PessoaDAO();
	
	
	public Pessoa salvarPessoaBO(Pessoa pessoa) throws ControleVacinasException {
		
		if (pessoa == null || pessoa.isEmpty()) {
            throw new ControleVacinasException("Todos os campos são obrigatórios.");
        } else {
        	pessoa = pessoaDAO.salvarPessoaDAO(pessoa);
        }
		return pessoa ;
	}
	
	public List<Pessoa> consultarTodasPessoasBO(int idPessoa){
		return pessoaDAO.consultarTodasPessoasDAO(idPessoa);
	}
	
	
	public boolean atualizarPessoaBO(Pessoa pessoa) {
		if (pessoa == null || pessoa.isEmpty()) {
            throw new IllegalArgumentException ("Dado invalido!");
        } else {
        	pessoa = pessoaDAO.salvarPessoaDAO(pessoa);
        }
		return pessoaDAO.atualizarPessoaDAO(pessoa);
	}
	
	
	public boolean excluirPessoaBO(Pessoa pessoa) {
		if (pessoa == null || pessoa.isEmpty()) {
            throw new IllegalArgumentException ("Dado invalido!");
        } else {
        	pessoa = pessoaDAO.salvarPessoaDAO(pessoa);
        }
		return pessoaDAO.excluirPessoaDAO(pessoa);
	}
	
	// O código throw new IllegalArgumentException("mensagem de erro"), em Java, 
	//é usado para lançar uma exceção de argumento inválido. Isso indica que um método 
	//recebeu um argumento inválido e o método não pode continuar a execução. 
	
	//O construtor IllegalArgumentException(String message)aceita uma mensagem
    //de erro como argumento. Esta mensagem pode ser usada para fornecer informações 
    //adicionais sobre o erro que ocorreu.


}
