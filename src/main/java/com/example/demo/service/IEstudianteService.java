package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

public interface IEstudianteService {

	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public Estudiante buscarPorGeneroQuery(String genero);
	public Estudiante buscarPorCedulaQuery(String cedula);
	public Estudiante buscarPorCiudadQuery(String ciudad);
	
	public Estudiante buscarPorNombreQueryTyped(String nombre);
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	
	
	//NATIVE QUERY
		public Estudiante buscarPorNombreNativeQuery(String nombre);
		//MEZCLA CON TYPED Y NATIVE
		public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);
		
		
		
		//public List<Estudiante> buscarPorNombreQueryList(String nombre);
		public List<Estudiante> buscarPorNombreNamedQueryList(String nombre);
		public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre);
		
		
		//DEVUELVE EL PRIMERO
		//public Estudiante buscarPorNombreQueryListFirst(String nombre);
		
		public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre);
		
		//CRITERIA QUERY
		public Estudiante buscarPorNombreQueryCriteria(String nombre);
		public List<Estudiante> buscarPorNombreQueryCriteriaAndOr(String nombre, String apellido, String bandera);
		
}
