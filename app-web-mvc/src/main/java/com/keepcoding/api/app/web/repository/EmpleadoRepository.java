package com.keepcoding.api.app.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keepcoding.api.app.web.entity.Empleado;

//anotacion para decirle q es un repositorio de metodos: @repository
// JpaRepository: interfaz proporcionada x SPRING DATA JPA q contiene metodos para realizar
//operaciones CRUD(CREATE, READ, UPDATE, DELETE)y otras comunes con la base de datos.
//al extender jpar... empleadoRepo.. hereda los metodos genericos save, finbyid, findAll..
//JpaRepository usa 2 parametros: entidad y tipo de clave primaria d esa entidad.
//Empleado es la entidad y Long es el tipo de la clave primaria
//Al extender JpaRepository, obtienes una serie de métodos predefinidos para interactuar con
//la base de datos sin tener que escribir implementaciones manuales para cada operación básica.
//Por ejemplo:save(Empleado empleado): Guarda un nuevo empleado o actualiza uno existent

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
