package com.consulting.serviciovideollamada.dao;

import java.util.List;

import com.consulting.serviciovideollamada.model.Doctor;

public interface DoctorDao {
	
	List<Doctor> findAllDoctor();
	
	void update(Doctor doctor);
	
	Doctor findByID(Long id);
}
