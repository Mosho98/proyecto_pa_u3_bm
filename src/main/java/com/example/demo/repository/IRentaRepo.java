package com.example.demo.repository;

import com.example.demo.modelo.Renta;

public interface IRentaRepo {

	public void insertar(Renta renta,String placa, String cedula);
	public void actualizar(Renta renta);
	
	public Renta buscar(Integer id);
	public void eliminar(Integer id);
}
