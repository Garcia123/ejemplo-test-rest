package com.consulting.serviciovideollamada.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LLAMADAS")
public class Llamada {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public boolean camposCompletos() {

		return !(idDoctorEmisor == 0 || nombreEmisor == null || nombreEmisor.isEmpty()
				|| idDoctorReceptor == 0 || nonbreReceptor == null || nonbreReceptor.isEmpty() || sala == null
				|| sala.isEmpty() || estado == 0);
	}

}
