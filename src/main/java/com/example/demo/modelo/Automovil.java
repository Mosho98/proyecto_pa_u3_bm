package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovil")

@NamedQueries({
@NamedQuery(name = "Automovil.buscarPorPlaca", query = "select a from Automovil a where a.placa = :datoPlaca"),
@NamedQuery(name = "Automovil.buscarPorColor", query = "select a from Automovil a where a.color = :datoColor"),
@NamedQuery(name = "Automovil.buscarPorTipo", query = "select a from Automovil a where a.tipo = :datoTipo"),
@NamedQuery(name = "Automovil.buscarPorKm", query = "select a from Automovil a where a.kilometraje = :datoKm"),
@NamedQuery(name = "Automovil.buscarPorMarca", query = "select a from Automovil a where a.marca = :datoMarca")})

@NamedNativeQueries({
@NamedNativeQuery(name = "Automovil.buscarPorPlacaNative", query = "select *from automovil where auto_placa = :datoPlaca", resultClass = Automovil.class),
@NamedNativeQuery(name = "Automovil.buscarPorColorNative", query = "select *from automovil where auto_color = :datoColor", resultClass = Automovil.class),
@NamedNativeQuery(name = "Automovil.buscarPorMarcaNative", query = "select *from automovil where auto_marca = :datoMarca", resultClass = Automovil.class)})
public class Automovil {
	
	@Id
	// name = cualquier o el nombre de la secuencia
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_seq")
	@SequenceGenerator(name = "auto_seq", sequenceName = "auto_seq", allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;

	@Column(name = "auto_placa")
	private String placa;
	
	@Column(name = "auto_color")
	private String color;
	
	@Column(name = "auto_tipo")
	private String tipo;
	
	@Column(name = "auto_anio")
	private String anio;
	
	@Column(name = "auto_cilindraje")
	private String cilindraje;
	
	@Column(name = "auto_km")
	private String kilometraje;
	
	@Column(name = "auto_marca")
	private String marca;

	
	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(String kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Automovil [id=" + id + ", placa=" + placa + ", color=" + color + ", tipo=" + tipo + ", anio=" + anio
				+ ", cilindraje=" + cilindraje + ", kilometraje=" + kilometraje + ", marca=" + marca + "]";
	}
	
	
}
