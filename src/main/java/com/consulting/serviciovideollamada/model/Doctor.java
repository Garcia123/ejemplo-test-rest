package com.consulting.serviciovideollamada.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "DOCTORES")
public class Doctor implements Serializable {

	@Id
	@Column(name = "ID")
	private Long ID;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "APELLIDOS")
	private String apellidos;

	@Column(name = "ESPECIALIDAD")
	private String especialidad;

	@Column(name = "ESTADO")
	private int estado;
	
	@Column(name = "ESTABLECIMIENTO")
	private String establecimiento;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public String getEstablecimiento() {
		return establecimiento;
	}

	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}

	public void setDoctor(Doctor doctor) {

		if (doctor.getNombre() != null)
			this.setNombre(doctor.getNombre().trim());
		if (doctor.getEstablecimiento() != null)
			this.setEstablecimiento(doctor.getEstablecimiento().trim());
		if (doctor.getApellidos() != null)
			this.setApellidos(doctor.getApellidos().trim());
		if (doctor.getEspecialidad() != null)
			this.setEspecialidad(doctor.getEspecialidad().trim());
		if (doctor.getEstado() > 0)
			this.setEstado(doctor.getEstado());

	}

}
