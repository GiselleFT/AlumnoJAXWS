package org.certificatic.dao;

import java.util.List;

import org.certificatic.entity.Alumno;

public interface AlumnoDAO {
	//por defecto son public abstract, pues es una interfaz
	Alumno guardarAlumno(Alumno alumno);
	
	List<Alumno> obtenerAlumnos();

}
