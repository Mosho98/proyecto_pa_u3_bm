package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;

public interface IHotelService {

	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOuterLeftJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOuterFullJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion);
	
	//
	public List<Hotel> buscarHabitacionOuterLeftJoin();
	public List<Hotel> buscarHabitacionOuterRightJoin();
	public List<Hotel> buscarHabitacionOuterFullJoin();
}
