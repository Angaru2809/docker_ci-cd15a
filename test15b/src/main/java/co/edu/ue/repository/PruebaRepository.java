package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ue.entities.Prueba;

@Repository
public class PruebaRepository implements IPruebaRepository {
	
	@Autowired
	private TestJpa jpa;

	@Override
	public List<Prueba> listPrueba() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}
	
	

}
