package com.consulting.serviciovideollamada.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.consulting.serviciovideollamada.model.Llamada;

@Repository
@Transactional
public class LlamadaDaoImpl extends AdtractSession implements LlamadaDao {

	@Override
	public void insertarLlamada(Llamada llamada) {
		// TODO Auto-generated method stub
		getSession().persist(llamada);
	}

	@Override
	public Llamada buscarLlamadaPorId(Long id) {
		// TODO Auto-generated method stub
		return getSession().get(Llamada.class, id);
	}

	@Override
	public void eliminarLlamada(Long id) {
		// TODO Auto-generated method stub
		Llamada llamada = buscarLlamadaPorId(id);
		if (llamada != null)
			getSession().delete(llamada);
	}

	@Override
	public Llamada buscarLlamadaPorIdReceptor(int idReceptor) {
		// TODO Auto-generated method stub
		return (Llamada) getSession().createQuery("from Llamada where idDoctorReceptor = :idDoctorReceptor")
				.setParameter("idDoctorReceptor", idReceptor)
				.uniqueResult();
	}

}
