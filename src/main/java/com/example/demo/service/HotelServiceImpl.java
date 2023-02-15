package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.repository.IHotelRepository;

@Service
public class HotelServiceImpl implements IHotelService{
	
	@Autowired
	private IHotelRepository hotelRepository;

	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelInnerJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOuterLeftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelOuterLeftJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelOuterRightJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOuterFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelOuterFullJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelFetchJoin(tipoHabitacion);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public List<Hotel> buscarHabitacionOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelOuterLeftJoin();
	}

	@Override
	public List<Hotel> buscarHabitacionOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelOuterRightJoin();
	}

	@Override
	public List<Hotel> buscarHabitacionOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelOuterFullJoin();
	}

}
