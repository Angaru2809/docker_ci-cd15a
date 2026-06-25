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
	@GetMapping(value="/prueba")
	public String prueba() {
		return "Hola otra prueba de que quedo funcionando Github Actions";
	}
	@GetMapping(value="/test_ci_prueba2")
	public String ciPrueba2() {
		return "Hola mira si funciona esto 2";
	}


	@GetMapping(value="/despliegue")
	public String despliegue(@RequestParam String mensaje) {
		return "Despliegue continuo OK: " + mensaje;
	}

	@GetMapping(value="/sumar")
    public int sumar(
            @RequestParam int numero1,
            @RequestParam int numero2) {

        return numero1 + numero2;
    }

	@GetMapping(value="/sumartres")
	public int sumartres(
			@RequestParam int numero1,
			@RequestParam int numero2,
			@RequestParam int numero3) {

		return numero1 + numero2 + numero3;
	}
	
	@GetMapping(value="/lista")
	public List<Prueba> getTesting(){
		return services.listPrueba();
	}
	

}
