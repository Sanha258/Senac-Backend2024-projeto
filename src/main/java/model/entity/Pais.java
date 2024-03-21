package model.entity;

public class Pais {
	
	private int idPais;
	private String nomePais;
	private String sigla;
	
	
	public Pais(int idPais, String nomePais, String sigla) {
		super();
		this.idPais = idPais;
		this.nomePais = nomePais;
		this.sigla = sigla;
	}


	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdPais() {
		return idPais;
	}


	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}


	public String getNomePais() {
		return nomePais;
	}


	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}


	public String getSigla() {
		return sigla;
	}


	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
	
}




