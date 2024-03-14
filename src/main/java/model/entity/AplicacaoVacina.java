package model.entity;

import java.util.Date;

public class AplicacaoVacina {
	
	 private Date dataAplicacao;
	 private Pessoa pessoa;
	 private int reacao; // Avaliação da reação (1 a 5)
	
	 public AplicacaoVacina(Date dataAplicacao, Pessoa pessoa, int reacao) {
		super();
		this.dataAplicacao = dataAplicacao;
		this.pessoa = pessoa;
		this.reacao = reacao;
	}

	public AplicacaoVacina() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getDataAplicacao() {
		return dataAplicacao;
	}

	public void setDataAplicacao(Date dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getReacao() {
		return reacao;
	}

	public void setReacao(int reacao) {
		this.reacao = reacao;
	}
	 
	 

}
