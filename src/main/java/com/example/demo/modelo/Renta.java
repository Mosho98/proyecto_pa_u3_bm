package com.example.demo.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "renta")
public class Renta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "ren_seq" )
	@SequenceGenerator(name="ren_seq", sequenceName ="ren_seq", allocationSize = 1)
	@Column(name="ren_id")
	private Integer id;
	
	@Column(name="ren_fecha")
	private LocalDateTime fechaRenta;
	
	@ManyToOne
	@JoinColumn(name="rent_id_automovil")
	private Vehiculo vehiculo;

	@ManyToOne
	@JoinColumn(name="rent_id_cliente")
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaRenta() {
		return fechaRenta;
	}

	public void setFechaRenta(LocalDateTime fechaRenta) {
		this.fechaRenta = fechaRenta;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	

}
