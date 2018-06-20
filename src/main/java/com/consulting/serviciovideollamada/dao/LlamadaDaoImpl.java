package com.consulting.serviciovideollamada.dao;

import com.consulting.serviciovideollamada.model.Llamada;

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

}
