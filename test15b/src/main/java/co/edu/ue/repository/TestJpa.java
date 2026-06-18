package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entities.Prueba;

public interface TestJpa extends JpaRepository<Prueba, Integer> {

}
