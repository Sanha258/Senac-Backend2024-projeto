package service;

import model.entity.Pais;
import model.repository.PaisRepository;

public class PaisService {
	
	private PaisRepository repository = new PaisRepository();

	public Pais inserir(Pais novoPais) {
		
		return repository.inserir(novoPais);
	}

}
