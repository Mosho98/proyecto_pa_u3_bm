package com.example.demo.modelo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "clien_seq" )
	@SequenceGenerator(name="clien_seq", sequenceName ="clien_seq", allocationSize = 1)
	@Column(name="clien_id")
	private Integer id;
	
	@Column(name="clien_nombre")
	private String nombre;
	
	@Column(name="clien_apellido")
	private String apellido;
	
	@Column(name="clien_edad")
	private String edad;
	
	@Column(name="clien_cedula")
	private String cedula;
	
	@Column(name="clien_fecha_renta")
	private LocalDateTime fechaRenta;
	
	
	
	
	@OneToMany(mappedBy = "cliente")
	private List<Renta> renta;

	
	public LocalDateTime getFechaRenta() {
		return fechaRenta;
	}

	public void setFechaRenta(LocalDateTime fechaRenta) {
		this.fechaRenta = fechaRenta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public List<Renta> getRenta() {
		return renta;
	}

	public void setRenta(List<Renta> renta) {
		this.renta = renta;
	}

	
	
	
	
}
