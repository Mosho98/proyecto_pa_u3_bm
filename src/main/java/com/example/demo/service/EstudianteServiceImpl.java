package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;
import com.example.demo.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteRepo estudianteRepo;
	
	
	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQuery(nombre);
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorApellidoQuery(apellido);
	}

	@Override
	public Estudiante buscarPorGeneroQuery(String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorGeneroQuery(genero);
	}

	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorCedulaQuery(cedula);
	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorCiudadQuery(ciudad);
	}

	@Override
	public Estudiante buscarPorNombreQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryTyped(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNamedQuery(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNamedQueryTyped(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNativeQuery(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNativeQueryTypedNamed(nombre);
	}

	/*@Override
	public List<Estudiante> buscarPorNombreQueryList(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryList(nombre);
	}*/

	@Override
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryTypedDTO(nombre);
	}

	@Override
	public Estudiante buscarPorNombreQueryCriteria(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryCriteria(nombre);
	}

	@Override
	public List<Estudiante> buscarPorNombreQueryCriteriaAndOr(String nombre, String apellido, String bandera) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryCriteriaAndOr(nombre, apellido, bandera);
	}
	
	

	/*@Override
	public Estudiante buscarPorNombreQueryListFirst(String nombre) {
		// TODO Auto-generated method stub
		 return this.estudianteRepo.buscarPorNombreQueryListFirst(nombre);
	}*/
	
	

}
