package model.entity;

import java.time.LocalDate;

public class AplicacaoVacina {
	
	 private int idAplicaçaoVacina;
	 private int idPessoa;
	 private Vacina vacina;
	 private LocalDate dataVacina;
	 private int avalicao;
	
	 public AplicacaoVacina(int idAplicaçaoVacina, int idPessoa, Vacina vacina, LocalDate dataVacina, int avalicao) {
		super();
		this.idAplicaçaoVacina = idAplicaçaoVacina;
		this.idPessoa = idPessoa;
		this.vacina = vacina;
		this.dataVacina = dataVacina;
		this.avalicao = avalicao;
	}

	public AplicacaoVacina() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdAplicaçaoVacina() {
		return idAplicaçaoVacina;
	}

	public void setIdAplicaçaoVacina(int idAplicaçaoVacina) {
		this.idAplicaçaoVacina = idAplicaçaoVacina;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}

	public LocalDate getDataVacina() {
		return dataVacina;
	}

	public void setDataVacina(LocalDate dataVacina) {
		this.dataVacina = dataVacina;
	}

	public int getAvalicao() {
		return avalicao;
	}

	public void setAvalicao(int avalicao) {
		this.avalicao = avalicao;
	}
	 
	 
	 

}
