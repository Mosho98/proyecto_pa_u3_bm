package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.service.IAutomovilService;

@SpringBootApplication
public class Tarea13PaU3BmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Tarea13PaU3BmApplication.class, args);
	}

	@Autowired
	private IAutomovilService automovilService;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Automovil sail = new Automovil();
		sail.setPlaca("LBB7250");
		sail.setColor("Rojo");
		sail.setMarca("Chevrolet");
		sail.setTipo("Manual");
		sail.setAnio("2015");
		sail.setCilindraje("1.4");
		sail.setKilometraje("120.000");
		this.automovilService.agregar(sail);*/
		
		/*
		System.out.println("QUERY TYPED BUSCAR POR PLACA");
		Automovil e1 = this.automovilService.buscarPorPlacaTypedQuery("LBB7250");
		System.out.println(e1);
		System.out.println("--------------------------------------------------");
		
		System.out.println("QUERY TYPED BUSCAR POR COLOR");
		Automovil e2 = this.automovilService.buscarPorColorTypedQuery("Rojo");
		System.out.println(e2);
		System.out.println("--------------------------------------------------");
		
		System.out.println("QUERY TYPED BUSCAR POR MARCA");
		Automovil e3 = this.automovilService.buscarPorMarcaTypedQuery("Chevrolet");
		System.out.println(e3);
		System.out.println("--------------------------------------------------");
		
		
		System.out.println("NAMED QUERY BUSCAR POR PLACA");
		Automovil e1 = this.automovilService.buscarPorPlacaNamedQuery("LBB7250");
		System.out.println(e1);
		System.out.println("--------------------------------------------------");
		
		System.out.println("NAMED QUERY BUSCAR POR COLOR");
		Automovil e2 = this.automovilService.buscarPorColorNamedQuery("Rojo");
		System.out.println(e2);
		System.out.println("--------------------------------------------------");
		
		System.out.println("NAMED QUERY BUSCAR POR KILOMETRAJE");
		Automovil e3 = this.automovilService.buscarPorKmNamedQuery("120.000");
		System.out.println(e3);
		System.out.println("--------------------------------------------------");
		
		
		System.out.println("NATIVE QUERY BUSCAR POR PLACA");
		Automovil e1 = this.automovilService.buscarPorPlacaNativeQuery("LBB7250");
		System.out.println(e1);
		System.out.println("--------------------------------------------------");
		
		System.out.println("NATIVE QUERY BUSCAR POR COLOR");
		Automovil e2 = this.automovilService.buscarPorColorNativeQuery("Rojo");
		System.out.println(e2);
		System.out.println("--------------------------------------------------");
		
		System.out.println("NATIVE QUERY BUSCAR POR TIPO");
		Automovil e3 = this.automovilService.buscarPorTipoNativeQuery("Manual");
		System.out.println(e3);
		System.out.println("--------------------------------------------------");*/
		
		
		System.out.println("NAMED NATIVE QUERY BUSCAR POR PLACA");
		Automovil e1 = this.automovilService.buscarPorPlacaNamedNativeQuery("LBB7250");
		System.out.println(e1);
		System.out.println("--------------------------------------------------");
		
		System.out.println("NAMED NATIVE QUERY BUSCAR POR COLOR");
		Automovil e2 =  this.automovilService.buscarPorColorNamedNativeQuery("Rojo");
		System.out.println(e2);
		System.out.println("--------------------------------------------------");
		
		System.out.println("NAMED NATIVE QUERY BUSCAR POR MARCA");
		Automovil e3 =  this.automovilService.buscarPorMarcaNamedNativeQuery("Chevrolet");
		System.out.println(e3);
		System.out.println("--------------------------------------------------");
		
	}

}
