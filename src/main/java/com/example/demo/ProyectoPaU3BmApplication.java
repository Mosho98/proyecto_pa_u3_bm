package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3BmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3BmApplication.class, args);
	}

	@Autowired
	private IEstudianteService estudianteService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Estudiante e1 = this.estudianteService.buscarPorNombreQuery("Bryan");
		System.out.println(e1);
		System.out.println("--------------------------------------------------");
		
		Estudiante e2 = this.estudianteService.buscarPorApellidoQuery("Mullo");
		System.out.println(e2);
		System.out.println("--------------------------------------------------");
		
		Estudiante e3 = this.estudianteService.buscarPorGeneroQuery("F");
		System.out.println(e3);
		System.out.println("--------------------------------------------------");
		
		Estudiante e4 = this.estudianteService.buscarPorCedulaQuery("12345678");
		System.out.println(e4);
		System.out.println("--------------------------------------------------");
		
		Estudiante e5 = this.estudianteService.buscarPorCiudadQuery("Loja");
		System.out.println(e5);
		System.out.println("--------------------------------------------------");
		
		
	}

}
