package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//representacion tabla objeto java
@Entity
@Table(name = "estudiante")
public class Estudiante {
	//siempre mapeamos con wraper 
	
	@Id		
	//name = cualquier o el nombre de la secuencia
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_seq")
	@SequenceGenerator(name = "estu_seq", sequenceName = "estu_seq", allocationSize = 1)
	@Column(name = "estu_id")
	private Integer id;
	
	@Column(name = "estu_nombre")
	private String nombre;
	
	@Column(name = "estu_apellido")
	private String apellido;
	
	@Column(name = "estu_genero")
	private String genero;
	
	@Column(name = "estu_cedula")
	private String cedula;
	
	@Column(name = "estu_pais")
	private String pais;
	
	@Column(name = "estu_ciudad")
	private String ciudad;
	
	@Column(name = "estu_hobby")
	private String hobby;
	
	@Column(name = "estu_salario")
	private BigDecimal salario;
	
	@Column(name = "estu_fecha_nacimieinto")
	private LocalDateTime estu_fecha_nacimiento;
	
	
	
	
	
	//METODO SET Y GET

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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCiudad() {
		return pais;
	}

	public void setCiudad(String ciudad) {
		this.pais = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDateTime getEstu_fecha_nacimiento() {
		return estu_fecha_nacimiento;
	}

	public void setEstu_fecha_nacimiento(LocalDateTime estu_fecha_nacimiento) {
		this.estu_fecha_nacimiento = estu_fecha_nacimiento;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero
				+ ", cedula=" + cedula + ", pais=" + pais + ", ciudad=" + ciudad + ", hobby=" + hobby + ", salario="
				+ salario + ", estu_fecha_nacimiento=" + estu_fecha_nacimiento + "]";
	}

	
	
	
	
	
	//TO STRING
	
	
	
	

	
}
