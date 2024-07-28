package com.keepcoding.api.app.web.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proveedor")
public class Proveedor implements Serializable {
	
	@Id
	//ESTE ES EL AUTOINCREMENT DEL ID
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String nombre;
	private String cif;
	private String direccion;
	private String email;
	private int telefono;
	
	
	
	
	



	public long getId() {
		return id;
	}








	public void setId(long id) {
		this.id = id;
	}








	public String getNombre() {
		return nombre;
	}








	public void setNombre(String nombre) {
		this.nombre = nombre;
	}








	public String getCif() {
		return cif;
	}








	public void setCif(String cif) {
		this.cif = cif;
	}








	public String getDireccion() {
		return direccion;
	}








	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}








	public String getEmail() {
		return email;
	}








	public void setEmail(String email) {
		this.email = email;
	}








	public int getTelefono() {
		return telefono;
	}








	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}








	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
