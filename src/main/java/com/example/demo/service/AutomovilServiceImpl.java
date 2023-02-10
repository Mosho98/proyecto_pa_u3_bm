package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.repository.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService{

	@Autowired
	private IAutomovilRepo automovilRepo;

	@Override
	public Automovil buscarPorPlacaTypedQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaTypedQuery(placa);
	}

	@Override
	public Automovil buscarPorPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaNamedQuery(placa);
	}

	@Override
	public Automovil buscarPorPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaNativeQuery(placa);
	}

	@Override
	public Automovil buscarPorPlacaNamedNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaNamedNativeQuery(placa);
	}

	@Override
	public Automovil buscarPorColorTypedQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorColorTypedQuery(color);
	}

	@Override
	public Automovil buscarPorColorNamedQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorColorNamedQuery(color);
	}

	@Override
	public Automovil buscarPorColorNativeQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorColorNativeQuery(color);
	}

	@Override
	public Automovil buscarPorColorNamedNativeQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorColorNamedNativeQuery(color);
	}

	@Override
	public Automovil buscarPorMarcaTypedQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaTypedQuery(marca);
	}

	@Override
	public Automovil buscarPorKmNamedQuery(String km) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorKmNamedQuery(km);
	}

	@Override
	public Automovil buscarPorTipoNativeQuery(String tipo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorTipoNativeQuery(tipo);
	}

	@Override
	public Automovil buscarPorMarcaNamedNativeQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaNamedNativeQuery(marca);
	}

	@Override
	public void agregar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepo.insertar(automovil);
	}
}
