package com.example.demo.service;

import com.example.demo.modelo.Renta;

public interface IRentaService {

	public void agregar(Renta renta,String placa, String cedula);
	public void modificar(Renta renta);
	
	public Renta encontrar(Integer id);
	public void borrar(Integer id);
}
