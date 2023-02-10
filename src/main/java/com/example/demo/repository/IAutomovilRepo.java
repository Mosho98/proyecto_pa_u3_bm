package com.example.demo.repository;

import com.example.demo.modelo.Automovil;


public interface IAutomovilRepo {
	
	public void insertar(Automovil automovil);

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
	
	
	
}
