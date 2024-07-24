package com.keepcoding.api.app.web.service;

import java.util.List;

import com.keepcoding.api.app.web.entity.Empleado;

public interface EmpleadoService {
	//metodo q devuelve 1 list de empleados
	public List<Empleado> listarEmpleados();
	
	//metodo para guardar nuevo empleado, cuando pulsas a guardar.
	public Empleado guardarEmpleado(Empleado empleado);
	
	//busqueda por id de empleado
	public Empleado obtenerEmpleado(Long id);
	
	//metodo especifico para actualizar un empleado
	public Empleado actualizarEmpleado(Empleado empleado);
	
	//metodo para eliminar un empleado
	public void eliminarEmpleado(Long id);
}
