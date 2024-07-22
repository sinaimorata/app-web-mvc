package com.keepcoding.api.app.web.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.api.app.web.entity.Empleado;
import com.keepcoding.api.app.web.repository.EmpleadoRepository;
import com.keepcoding.api.app.web.service.EmpleadoService;
//q tengo q decirle a spring pr q sepa q es un servicio: @Service@Service
//En resumen, este código define una clase de servicio que debería implementar la lógica
//para listar empleados, y usa anotaciones para manejar la creación y gestión de instancias
//en Spring.
@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	//@Autowired: Se usa para decirle a Spring que automáticamente debe proporcionar una 
	//instancia de la clase que se está inyectando. En tu caso, empleadoRepository es un objeto que
	//Spring creará y gestionará por ti. La anotación se pone antes del campo empleadoRepository 
	//para que Spring lo rellene con la implementación adecuada de EmpleadoRepository cuando se 
	//necesite
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado> listarEmpleados() {		
		return empleadoRepository.findAll();
	}
	

}
