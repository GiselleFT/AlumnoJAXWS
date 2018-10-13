package org.certificatic.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.dao.AlumnoDAO;
import org.certificatic.dao.AlumnoDAOImpl;
import org.certificatic.entity.Alumno;

@WebService(endpointInterface = "org.certificatic.service.AlumnoService")
public class AlumnoServiceImpl implements AlumnoService{

	AlumnoDAO alumnoDao = new AlumnoDAOImpl();
	
	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		return alumnoDao.guardarAlumno(alumno);
	}

	@Override
	public List<Alumno> obtenerAlumnos() {
		// TODO Auto-generated method stub
		return alumnoDao.obtenerAlumnos();
	}

}
