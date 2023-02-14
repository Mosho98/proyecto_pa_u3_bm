package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU3BmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3BmApplication.class, args);
	}

	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IHotelService hotelService;
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
		System.out.println("--------------------------------------------------");
		
		
		
		System.out.println("NAMED QUERY TYPED");
		Estudiante e2 = this.estudianteService.buscarPorNombreNamedQueryTyped("Mabel");
		System.out.println(e2);
		System.out.println("--------------------------------------------------");
		
		
		System.out.println("DTO");
		EstudianteDTO e2 = this.estudianteService.buscarPorNombreQueryTypedDTO("Bryan");
		System.out.println(e2);
		System.out.println("--------------------------------------------------");
		
		
		System.out.println("CRITERIA API QUERY");
		Estudiante e2 = this.estudianteService.buscarPorNombreQueryCriteria("Bryan");
		System.out.println(e2);
		System.out.println("--------------------------------------------------");
		
		
List <Estudiante> estudiantes= this.estudianteService.buscarPorNombreQueryCriteriaAndOr("Bryan", "Mullo", "F");
		
		System.out.println("LISTA CON CRITERIA API QUERY");
		for(Estudiante estu: estudiantes) {
			System.out.println(estu);
			
		}
		System.out.println("--------------------------------------------------");
		
		
		int borrarApe = this.estudianteService.eliminarPorApellido("Mullo");
		System.out.println(borrarApe);
		
		int atualizarApe = this.estudianteService.actualizarPorApellido("Jimenez", "Maoly");
		System.out.println(atualizarApe);*/
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
List <Hotel> inner= this.hotelService.buscarHotelInnerJoin("VIP");
		
		System.out.println("LISTA CON INNER JOIN");
		for(Hotel var: inner) {
			System.out.println(var.getNombre());
			for(Habitacion ha: var.getHabitaciones()) {
				System.out.println("Las habitaciones de: " + var.getNombre());
			}
			System.out.println(var.getHabitaciones());
			
		}
		System.out.println("--------------------------------------------------");
		
/*
List <Hotel> leftJoin= this.hotelService.buscarHotelOuterLeftJoin("VIP");
		
		System.out.println("LISTA CON OUTER LEFT JOIN");
		for(Hotel var: leftJoin) {
			System.out.println(var);
			
		}
		System.out.println("--------------------------------------------------");
		
		
		
List <Hotel> rightJoin= this.hotelService.buscarHotelOuterRightJoin("VIP");
		
		/*System.out.println("LISTA CON OUTER RIGHT JOIN");
		for(Hotel var: rightJoin) {
			System.out.println(var);
			
		}
		System.out.println("--------------------------------------------------");
		
		/*
List <Hotel> fullJoin= this.hotelService.buscarHotelOuterFullJoin("A1");
		
		System.out.println("LISTA CON OUTER FULL JOIN");
		for(Hotel var: fullJoin) {
			System.out.println(var);
			
		}
		System.out.println("--------------------------------------------------");
		
		
		
List <Hotel> fecthJoin= this.hotelService.buscarHotelFetchJoin("A1");
		
		System.out.println("LISTA CON OUTER FULL JOIN");
		for(Hotel var: fecthJoin) {
			System.out.println(var);
			
		}
		System.out.println("--------------------------------------------------");*/
		
		
	}

}
