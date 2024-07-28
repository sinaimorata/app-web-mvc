package com.keepcoding.api.app.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.keepcoding.api.app.web.entity.Proveedor;

//Dond. empiez el filtro en los mét. En JpaRepository solo tengo los básicos:save,buscar todos, buscar x id.
//x tt, para algún filtro lo tengo q crear. se puede hacer x query y un mét dd le digo q busque algo parecido
//con el like al nombre
@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
	
	@Query("SELECT p FROM Proveedor p WHERE p.nombre LIKE %:nombre%")
	public List<Proveedor> filterName(String nombre);
	
	List<Proveedor> findByNombre(String nombre);
	
}
