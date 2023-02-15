package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Habitacion;

public interface IHabitacionRepository {

	public List<Habitacion> buscarHabitacionOuterLeftJoin();
	public List<Habitacion> buscarHabitacionOuterRightJoin();
	public List<Habitacion> buscarHabitacionOuterFullJoin();
}
