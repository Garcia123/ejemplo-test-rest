package com.consulting.serviciovideollamada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consulting.serviciovideollamada.dao.DoctorDao;
import com.consulting.serviciovideollamada.model.Doctor;

@Service("doctorService")
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorDao _doctorDAO;

	@Override
	public List<Doctor> findAllDoctor() {
		// TODO Auto-generated method stub
		return _doctorDAO.findAllDoctor();
	}

	@Override
	public void update(Doctor doctor) {
		_doctorDAO.update(doctor);
		
	}

	@Override
	public Doctor findByID(Long id) {
		// TODO Auto-generated method stub
		return _doctorDAO.findByID(id);
	}

}
