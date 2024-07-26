package com.keepcoding.api.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.keepcoding.api.app.web.entity.Empleado;
import com.keepcoding.api.app.web.service.EmpleadoService;
//Todos los metodos q van a llamar a 1 pag HTML devuelven un string. El nombre del template
@Controller
public class EmpleadoController {
	
	//inyectar el servicio
	@Autowired
	private EmpleadoService empleadoService;
	
	
	//Mapping -con esto asigno una ruta
	//se puede tener + d 1 ruta: mientodolo cm lo vemos
	@GetMapping({"/", "/empleados"})
	public String index(Model modelo) {
		modelo.addAttribute("empleados",empleadoService.listarEmpleados());
		return "empleado";
	}
	@GetMapping("/empleado/new")
	public String newEmpleadoForm(Model modelo) {
		Empleado empleado = new Empleado();
		modelo.addAttribute("empleado", empleado);
		return "crear_empleado";
	}
	//metodo para guardar: post
	@PostMapping("/empleado")
	public String saveEmpleado(@ModelAttribute("empleado") Empleado empleado) {
		//anotacion especifica pr recibir modelo:modelAttribute. anotacion q vincula 1 parametro de un met a
		//un valor de retorno de un metodo
		empleadoService.guardarEmpleado(empleado);
		//el error daba pq el return q debía devolver un string.Apuntar de vueltaal home. redirect: home
		return "redirect:/";
	}
	
	//@PathVariable:recibir valores q estan en ruta.
	@GetMapping("/empleado/editar/{id}")
	public String updateEmpleadoForm(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("empleado_update",empleadoService.obtenerEmpleado(id) );
		return "editar_empleado";
	}
	@PostMapping("/empleado/{id}")
	public String updateEmpleado(@PathVariable Long id, @ModelAttribute("empleado_update")Empleado empleado) {
		Empleado empleadoExistente = empleadoService.obtenerEmpleado(id);
		empleadoExistente.setId(id);
		empleadoExistente.setNombre(empleado.getNombre());
		empleadoExistente.setApellido(empleado.getApellido());
		empleadoExistente.setEmail(empleado.getEmail());
		empleadoExistente.setTelefono(empleado.getTelefono());
		
		empleadoService.actualizarEmpleado(empleadoExistente);
		
		
		return "redirect:/";
	}
	
	@GetMapping("/empleado/delete/{id}")
	public String deleteEmpleado(@PathVariable Long id){
		empleadoService.eliminarEmpleado(id);
		return "redirect:/";
	}
		
	
	
	//PARA 1 VISTA Q HACE 1 REGISTRO TENGO Q HACER DOS MET: ELQUE LLAME A ESA VISTA Y LA OTRA Q RECIBE ESOS 
	//ATRIBUTOS. EN CREAR EMPLEADO DEBO CONVERTIR EL MODELO A LOS CASMPOS Q PASA AQUI. UN MODELO VACIO EN EMPLEAO CONTRO
	//Y SE LO PASO A CREAR EMPLEADO
	
}
	//ULTIMO PASO LLAMAR AL CONTROLADOR DESDE DD VENIMOS EMPLEADO SERVICE:PRIMERO TEMA DEL ACTUALIZAR Q ESLO
    //MAS LARGO. PARA ACTUALIZAR NECESITO 2 METODOS:LLAMAR AL FORMULARIO Y OTRA Q GUARDA COMO TAL. X TT 1
	//GET MAPPING Y 


