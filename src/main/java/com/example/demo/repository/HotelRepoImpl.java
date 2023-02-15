package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override

public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		// select * from hotel h join habitacion ha on h.hote_id=ha.habi_id_hotel
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h INNER JOIN h.habitaciones ha WHERE ha.habiTipo= :datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		// Especificar que se quiere consultar bajo demanda
		List<Hotel> listaHoteles = myQuery.getResultList();
		for (Hotel h : listaHoteles) {
			List<Habitacion> listatmp =new ArrayList<>();
			for(Habitacion ha: h.getHabitaciones()) {
				if(ha.getHabiTipo().equals(tipoHabitacion)) {
					listatmp.add(ha);
				}
			}
			h.setHabitaciones(listatmp);
		}
		return listaHoteles;
	}

	@Override
	public List<Hotel> buscarHotelOuterLeftJoin(String tipoHabitacion) {
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h LEFT JOIN h.habitaciones ha WHERE ha.habiTipo = :datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
				
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion) {
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h RIGHT JOIN h.habitaciones ha WHERE ha.habiTipo = :datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		List<Hotel> listHoteles = myQuery.getResultList();
		// BAJO DEMANDA ES DECIR CON EL LAZY
		/*
		 * for(Hotel h: listHoteles) { h.getHabitaciones().size(); }
		 */
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelOuterFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion) {
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h JOIN FETCH h.habitaciones ha WHERE ha.habiTipo = :datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		List<Hotel> listHoteles = myQuery.getResultList();
		// BAJO DEMANDA ES DECIR CON EL LAZY
		for (Hotel h : listHoteles) {
			h.getHabitaciones().size();
		}
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelOuterLeftJoin() {
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h LEFT JOIN h.habitaciones ha", Hotel.class);
	
		List<Hotel> lista = myQuery.getResultList();
		for(Hotel h: lista) {
			h.getHabitaciones().size();
		}
		return lista;
	}

	@Override
	public List<Hotel> buscarHotelOuterRightJoin() {
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h RIGHT JOIN h.habitaciones ha", Hotel.class);
	
		List<Hotel> lista = myQuery.getResultList();
//		for(Hotel h: lista) {
//			h.getHabitaciones().size();
//		}
		return lista;
	}

	@Override
	public List<Hotel> buscarHotelOuterFullJoin() {
		// TODO Auto-generated method stub
		return null;
	}

}
