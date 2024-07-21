package com.keepcoding.api.app.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.keepcoding.api.app.web.entity.Prueba;



//VER COMO FUNCIONA Thymeleaf
//anotacion pero como no es apy rest. ya no es restcontroller. solo @controller
//@Controller para aplicacion web de tipo mvc
@Controller
public class PruebaController {
	
	//private static final Prueba objPrueba = null;

	//me creo la clase y defino la ruta. 
	// siempre un GET lo que llama a una vista
	//Gracias al motor de plantillas yo paso plantilla y en los metodos para 
	//llamar a las plantillas lo q tengo que hace es pasar su nombre,del archivo
	//como tal(hola en este ejemplo)
	@GetMapping("/saludo")
	
	//cm recibe parametros?? . Se hace a traves de 1. objeto especial:Model
	//y un nombre q asigne a ese objeto: modelo
	//carga ese mensaje al motor de plantillas(hola.html)
	

	public String saludar(Model modelo) {
		List<Prueba> lista = new ArrayList<>();
		//ahora quiero pasar un obj. 1ºcreo la clase en entity y ahora
		// ahora queremos ver como trabaj tiymeleaf con listas;		
		
		Prueba objPrueba = new Prueba();
				
		Prueba objPrueba2 = new Prueba();
				
		objPrueba.setId(23232);
		objPrueba.setName("dato de prueba");
				
		objPrueba2.setId(7841);
		objPrueba2.setName("otro dato de prueba");
				
				
		lista.add(objPrueba);
		lista.add(objPrueba2);
				//pasar los atributos con esta key.  paso el objeto
		modelo.addAttribute("key",lista);
		//parallar a vistas hay q devolver un string en el método. El string
		//seria el hombre del templete(hola.html) y x tt hola
		//paso cm primer parametro un key o identificador q sirve pr mostrarlo en
		//la vista html, en string. EN modelo paso lo q quiera. un string pj.
		//modelo.addAttribute("key", "Este valor desde el controlador");
		return "hola";
		
	}
	
}
