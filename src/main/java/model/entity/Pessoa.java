package model.entity;

import java.sql.Date;

import java.util.List;

public class Pessoa {
	
	private int idPessoa;
	private String nome;
	private Date dataNascimento;
	private char sexo;
	private String cpf;
	private String tipo;
	private List<AplicacaoVacina> vacinacoes;


	public Pessoa(int idPessoa, String nome, Date dataNascimento, char sexo, String cpf, String tipo,
			List<AplicacaoVacina> vacinacoes) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
		this.tipo = tipo;
		this.vacinacoes = vacinacoes;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date localDate) {
		this.dataNascimento = localDate;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<AplicacaoVacina> getVacinacoes() {
		return vacinacoes;
	}

	public void setVacinacoes(List<AplicacaoVacina> vacinacoes) {
		this.vacinacoes = vacinacoes;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	


}
