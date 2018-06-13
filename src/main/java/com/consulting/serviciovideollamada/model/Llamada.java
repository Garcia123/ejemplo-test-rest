package com.consulting.serviciovideollamada.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LLAMADAS")
public class Llamada {

	private int id;
	private int idDoctorEmisor;
	private String nombreEmisor;
	private int idDoctorReceptor;
	private String nonbreReceptor;
	private String sala;
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
