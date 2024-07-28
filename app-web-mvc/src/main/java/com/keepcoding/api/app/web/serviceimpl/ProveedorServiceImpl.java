package com.keepcoding.api.app.web.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.api.app.web.entity.Proveedor;
import com.keepcoding.api.app.web.repository.ProveedorRepository;
import com.keepcoding.api.app.web.service.ProveedorService;
@Service
public class ProveedorServiceImpl implements ProveedorService {
	
	@Autowired
	private ProveedorRepository proveedorRepository;
	
	
	@Override
	public List<Proveedor> listaProveedor(String dato) {
		if(dato !=null) {
			return proveedorRepository.filterName(dato);
		}else {
			return proveedorRepository.findAll();
		}
		
	}
	

}
