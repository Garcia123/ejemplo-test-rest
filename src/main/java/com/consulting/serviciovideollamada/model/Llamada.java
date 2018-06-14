package com.consulting.serviciovideollamada.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LLAMADAS")
public class Llamada {
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "ID_DOCTOR_EMISOR")
	private int idDoctorEmisor;
	
	@Column(name = "NOMBRE_EMISOR")
	private String nombreEmisor;
	
	@Column(name = "ID_DOCTOR_RECEPTOR")
	private int idDoctorReceptor;
	
	@Column(name = "NOMBRE_RECEPTOR")
	private String nonbreReceptor;
	
	@Column(name = "SALA")
	private String sala;
	
	@Column(name = "ESTADO")
	private int estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdDoctorEmisor() {
		return idDoctorEmisor;
	}

	public void setIdDoctorEmisor(int idDoctorEmisor) {
		this.idDoctorEmisor = idDoctorEmisor;
	}

	public String getNombreEmisor() {
		return nombreEmisor;
	}

	public void setNombreEmisor(String nombreEmisor) {
		this.nombreEmisor = nombreEmisor;
	}

	public int getIdDoctorReceptor() {
		return idDoctorReceptor;
	}

	public void setIdDoctorReceptor(int idDoctorReceptor) {
		this.idDoctorReceptor = idDoctorReceptor;
	}

	public String getNonbreReceptor() {
		return nonbreReceptor;
	}

	public void setNonbreReceptor(String nonbreReceptor) {
		this.nonbreReceptor = nonbreReceptor;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
