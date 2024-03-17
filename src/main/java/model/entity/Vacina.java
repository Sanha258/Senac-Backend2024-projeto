package model.entity;

import java.time.LocalDate;


public class Vacina {
	
	private int idVacina;
	private String paisOrigem;
	private String nomeVacina;
    private LocalDate dataInicioPesquisa;
    private Pessoa pesquisadorResponsavel;
    private int estagio;
    
	public Vacina(int idVacina, String paisOrigem, String nomeVacina, LocalDate dataInicioPesquisa,
			Pessoa pesquisadorResponsavel, int estagio) {
		super();
		this.idVacina = idVacina;
		this.paisOrigem = paisOrigem;
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

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
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
