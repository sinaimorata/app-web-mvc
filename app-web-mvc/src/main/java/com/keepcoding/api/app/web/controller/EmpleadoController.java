package com.keepcoding.api.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.keepcoding.api.app.web.service.EmpleadoService;
//Todos los metodos q van a llamar a 1 pag HTML devuelven un string. El nombre del template
@Controller
public class EmpleadoController {
	
	//inyectar el servicio
	@Autowired
	private EmpleadoService empleadoService;
	//Mapping -con esto asigno una ruta
	@GetMapping("/empleados")
	public String index(Model modelo) {
		modelo.addAttribute("key",empleadoService.listarEmpleados());
		return "hola";
	}
	
}
