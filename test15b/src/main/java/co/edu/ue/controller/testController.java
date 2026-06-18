package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entities.Prueba;
import co.edu.ue.service.IPruebaService;

@RestController
@CrossOrigin(origins = "*")
public class testController {
	
	@Autowired
	IPruebaService services;
	
	@GetMapping(value="/saludar")
	public String hello() {
		return "Hola estudiantes de la 15B";
	}

	@GetMapping(value="/test_ci")
    public String ci () {
		return "Hola desde CI con Github Actions";
    }

	@GetMapping(value="/sumar")
    public int sumar(
            @RequestParam int numero1,
            @RequestParam int numero2) {

        return numero1 + numero2;
    }
	
	@GetMapping(value="/lista")
	public List<Prueba> getTesting(){
		return services.listPrueba();
	}
	

}
