package model.entity;

import java.time.LocalDate;
import java.util.List;

public class Pessoa {
	
	private int idPessoa;
	private String nome;
	private LocalDate dataNascimento;
	private char sexo;
	private String cpf;
	private int tipo;
	


	public Pessoa(int idPessoa, String nome, LocalDate dataNascimento, char sexo, String cpf, int tipo) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
		this.tipo = tipo;
		
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate localDate) {
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	


	
	


}
