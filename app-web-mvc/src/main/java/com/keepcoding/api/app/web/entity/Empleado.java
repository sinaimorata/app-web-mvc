package com.keepcoding.api.app.web.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//SERIALIZABLE- PROPIEDAD DE JAVA. ESO Y UN IDENTIFICAEDOR UNICO PR Q CUANDO TENGAS +ENTIDADES
//NO LO CONFUNDA. LO ENTINDA CM UNICO. ES UN IDENTIFICADOR DE IDENTIDADES.
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
//ANOTACION PARA Q EMPLEADO SE TRANSFORME EN UNA TABLA DE BASE DE DATOS:
@Table(name="empleado")
public class Empleado implements Serializable {
//ahora falta decirle quien va a ser el id	
	//tras esto, si ejecuto lo tengo q ver cm tabla
	@Id
	//generar el autoincrement: generate value sobre el id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//sobre estos atributos hacer q no sean nulos q lo son por defecto con column
	@Column(nullable = false, length = 100)
	private String nombre;
	@Column(nullable = false, length = 100)
	private String apellido;
	@Column(nullable = false, length = 100)
	private String email;
	//los numericos son not nulle y x tt, no hace falta meter la etiqueta column
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	
	//ADD DEFAULT SERIAL VERSION ID.ES PROPIO DEL SERIALIZABLE. SE CORTA Y SE PONE AQUI. 
	//DENTRO DE LA CLASE
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
