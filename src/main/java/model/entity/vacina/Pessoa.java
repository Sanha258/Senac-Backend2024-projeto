package model.entity.vacina;

import java.time.LocalDateTime;

public class Pessoa {
	
	private String nome;
	private LocalDateTime dtNascimento;
	private String cpf;
	private String Sexo;
	
	public Pessoa(String nome, LocalDateTime dtNascimento, String cpf, String sexo) {
		super();
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
		Sexo = sexo;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDateTime dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	
	
	
	
	
	


}
