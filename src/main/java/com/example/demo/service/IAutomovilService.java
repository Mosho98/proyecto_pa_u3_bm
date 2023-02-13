package com.example.demo.service;

import com.example.demo.modelo.Automovil;

public interface IAutomovilService {

	public void agregar(Automovil automovil);
	
	
	public Automovil buscarPorPlacaTypedQuery(String placa);
	public Automovil buscarPorPlacaNamedQuery(String placa);
	public Automovil buscarPorPlacaNativeQuery(String placa);
	public Automovil buscarPorPlacaNamedNativeQuery(String placa);
	
	public Automovil buscarPorColorTypedQuery(String color);
	public Automovil buscarPorColorNamedQuery(String color);
	public Automovil buscarPorColorNativeQuery(String color);
	public Automovil buscarPorColorNamedNativeQuery(String color);
	
	public Automovil buscarPorMarcaTypedQuery(String marca);
	public Automovil buscarPorKmNamedQuery(String km);
	public Automovil buscarPorTipoNativeQuery(String tipo);
	public Automovil buscarPorMarcaNamedNativeQuery(String marca);
	
	public int eliminarPorPlaca(String placa);
	public int eliminarPorColor(String color);
	public int actualizarPorPlaca(String placa, String marca);
	public int actualizarPorAnio(String anio, String km);
}
