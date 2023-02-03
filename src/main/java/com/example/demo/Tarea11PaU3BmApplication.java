package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IRentaService;
import com.example.demo.service.IVehiculoService;


@SpringBootApplication
public class Tarea11PaU3BmApplication implements CommandLineRunner{

	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IRentaService iRentaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea11PaU3BmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo v1=new Vehiculo();
		v1.setMarca("Chevrolet");
		v1.setColor("Rojo");
		v1.setKilometraje("150000");
		v1.setTipo("Manual");
		v1.setPlaca("LBB7250");		

		this.iVehiculoService.agregar(v1);



		Cliente cli=new Cliente();
		cli.setNombre("Bryan");
		cli.setApellido("Mullo");
		cli.setEdad("24");
		cli.setCedula("1753054285");
		cli.setFechaRenta(LocalDateTime.now());
		this.clienteService.agregar(cli);
		
		

		Renta renta=new Renta();
		renta.setVehiculo(v1);
		renta.setCliente(cli);
		renta.setFechaRenta(LocalDateTime.now());
		this.iRentaService.agregar(renta, v1.getPlaca(), cli.getCedula());
	}

}
