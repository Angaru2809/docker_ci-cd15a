package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.entities.Prueba;
import co.edu.ue.repository.IPruebaRepository;

@Service
public class PruebaService implements IPruebaService {
	
	@Autowired
	IPruebaRepository repository;

	@Override
	public List<Prueba> listPrueba() {
		// TODO Auto-generated method stub
		return repository.listPrueba();
	}
	
	
}
