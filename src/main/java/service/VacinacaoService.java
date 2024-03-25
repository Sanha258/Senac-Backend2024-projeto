package service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import exeption.vacinacaoException;

import model.entity.Vacinacao;
import model.repository.VacinacaoRepository;

public class VacinacaoService {
	
	private VacinacaoRepository repository = new VacinacaoRepository();

	public Vacinacao inserir(Vacinacao novaVacinacao) {
		// TODO Auto-generated method stub
		return  repository.salvar(novaVacinacao);
	}
	
	public void salvar(Vacinacao novaVacinacao) throws vacinacaoException {
	    if (novaVacinacao.getIdPessoa() <= 0) {
	        throw new IllegalArgumentException("ID da pessoa deve ser informado.");
	    
	    }
	    if (novaVacinacao.getVacina() == null)  {
	        throw new IllegalArgumentException("Vacina deve ser informada.");
	    }

	    LocalDate dataAtual = LocalDate.now(ZoneId.of("UTC"));
	    if (novaVacinacao.getDataAplicacao() == null) {
	        novaVacinacao.setDataAplicacao(dataAtual);
	    }
	    if (novaVacinacao.getAvaliacao() < 1 || novaVacinacao.getAvaliacao() > 5)  {
	        novaVacinacao.setAvaliacao(5);
	    }
	    
	}

	public boolean atualizar(Vacinacao vacinacao) {
	
		return false;
	}

	public boolean excluir(int id) {
		return repository.excluir(id);
	}

	public Vacinacao consultarPorId(int id) {
		return repository.consultarPorId(id);
	}

	public ArrayList<Vacinacao> consultarTodas() {
		return repository.consultarTodos();
	}

	public ArrayList<Vacinacao> consultarPorIdPessoa(int id) {
		return repository.consultarPorIdPessoa(id);
	}

}
