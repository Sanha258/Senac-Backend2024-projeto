package model.entity;

import java.time.LocalDate;


public class Vacina {
	
	private int idVacina;
	private Pais pais;
	private String nomeVacina;
    private LocalDate dataInicioPesquisa;
    private Pessoa pesquisadorResponsavel;
    private int estagio;
    
	public Vacina(int idVacina, Pais pais, String nomeVacina, LocalDate dataInicioPesquisa,
			Pessoa pesquisadorResponsavel, int estagio) {
		super();
		this.idVacina = idVacina;
		this.pais = pais;
		this.nomeVacina = nomeVacina;
		this.dataInicioPesquisa = dataInicioPesquisa;
		this.pesquisadorResponsavel = pesquisadorResponsavel;
		this.estagio = estagio;
	}

	public Vacina() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdVacina() {
		return idVacina;
	}

	public void setIdVacina(int idVacina) {
		this.idVacina = idVacina;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais string) {
		this.pais = string;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public LocalDate getDataInicioPesquisa() {
		return dataInicioPesquisa;
	}

	public void setDataInicioPesquisa(LocalDate dataInicioPesquisa) {
		this.dataInicioPesquisa = dataInicioPesquisa;
	}

	public Pessoa getPesquisadorResponsavel() {
		return pesquisadorResponsavel;
	}

	public void setPesquisadorResponsavel(Pessoa pesquisadorResponsavel) {
		this.pesquisadorResponsavel = pesquisadorResponsavel;
	}

	public int getEstagio() {
		return estagio;
	}

	public void setEstagio(int estagio) {
		this.estagio = estagio;
	}
    
	
	

}
