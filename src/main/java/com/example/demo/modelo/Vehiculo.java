package com.example.demo.modelo;

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
@Table(name = "vehiculo")
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "vehi_seq" )
	@SequenceGenerator(name="vehi_seq", sequenceName ="vehi_seq", allocationSize = 1)
	@Column(name="vehi_id")
	private Integer id;
	
	@Column(name="vehi_marca")
	private String marca;
	
	@Column(name="vehi_color")
	private String color;
	
	@Column(name="vehi_km")
	private String kilometraje;
	
	@Column(name="vehi_tipo")
	private String tipo;
	
	@Column(name="vehi_placa")
	private String placa;
	
	@OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
	private List<Renta> renta;
		
	

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(String kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Renta> getRenta() {
		return renta;
	}

	public void setRenta(List<Renta> renta) {
		this.renta = renta;
	}

	
	
	
	
	
	
	
	

}
