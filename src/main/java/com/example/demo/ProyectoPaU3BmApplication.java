package com.example.demo;

import java.util.List;

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
		
		
		
		/*System.out.println("QUERY TYPED");
		Estudiante e6 = this.estudianteService.buscarPorNombreQueryTyped("Bryan");
		System.out.println(e6);
		System.out.println("--------------------------------------------------");
		
		System.out.println("NAMED QUERY");
		Estudiante e1 = this.estudianteService.buscarPorNombreNamedQuery("Bryan");
		System.out.println(e1);
		System.out.println("--------------------------------------------------");
		
		System.out.println("NAMED QUERY TYPED");
		Estudiante e2 = this.estudianteService.buscarPorNombreNamedQueryTyped("Bryan");
		System.out.println(e2);
		System.out.println("--------------------------------------------------");
		
		System.out.println("NATIVE QUERY");
		Estudiante e3 = this.estudianteService.buscarPorNombreNativeQuery("Bryan");
		System.out.println(e3);
		System.out.println("--------------------------------------------------");
		
		
		System.out.println("MEZCLA CON TYPED Y NATIVE");
		Estudiante e4 = this.estudianteService.buscarPorNombreNativeQueryTypedNamed("Bryan");
		System.out.println(e4);
		System.out.println("--------------------------------------------------");*/

		
		
	/*	//IMPRIME LISTA DE NOMBRES REPETIDOS
		
	List <Estudiante> estudiantes= this.estudianteService.buscarPorNombreQueryList("Mabel");
		
		System.out.println("LISTA");
		for(Estudiante estu: estudiantes) {
			System.out.println(estu);
			
		}
		System.out.println("--------------------------------------------------");*/
		
		/*System.out.println("GET RESULT FIRST");
		Estudiante e4 = this.estudianteService.buscarPorNombreQueryListFirst("nombre");
		System.out.println(e4);
		System.out.println("--------------------------------------------------");*/
		
		
		
		System.out.println("NAMED QUERY TYPED");
		Estudiante e2 = this.estudianteService.buscarPorNombreNamedQueryTyped("Bryan");
		System.out.println(e2);
		System.out.println("--------------------------------------------------");
		
		
		
		
	}

}
