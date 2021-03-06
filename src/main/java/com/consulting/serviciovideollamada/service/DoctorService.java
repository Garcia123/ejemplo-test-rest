package com.consulting.serviciovideollamada.service;

import java.util.List;

import com.consulting.serviciovideollamada.model.Doctor;

public interface DoctorService {
	
	List<Doctor> findAllDoctor();
	
	void update(Doctor doctor);
	
	Doctor findByID(Long id);
	
}
