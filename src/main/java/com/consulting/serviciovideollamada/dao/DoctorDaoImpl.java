package com.consulting.serviciovideollamada.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.consulting.serviciovideollamada.model.Doctor;

@Repository
@Transactional
public class DoctorDaoImpl extends AdtractSession implements DoctorDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Doctor> findAllDoctor() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Doctor").list();
	}

	@Override
	public void update(Doctor doctor) {
		// TODO Auto-generated method stub
		getSession().update(doctor);
	}

	@Override
	public Doctor findByID(Long id) {
		// TODO Auto-generated method stub
		return getSession().get(Doctor.class, id);
	}

}
