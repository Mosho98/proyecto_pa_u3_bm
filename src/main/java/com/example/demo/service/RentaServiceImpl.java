package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Renta;
import com.example.demo.repository.IRentaRepo;

@Service
public class RentaServiceImpl implements IRentaService{

	@Autowired
	private IRentaRepo iRentaRepo;
	

	@Override
	public void modificar(Renta cliente) {
		// TODO Auto-generated method stub
		this.iRentaRepo.actualizar(cliente);
	}

	@Override
	public Renta encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.iRentaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iRentaRepo.eliminar(id);
	}

	@Override
	public void agregar(Renta renta, String placa, String cedula) {
		// TODO Auto-generated method stub
		this.iRentaRepo.insertar(renta, placa, cedula);
	}

}
