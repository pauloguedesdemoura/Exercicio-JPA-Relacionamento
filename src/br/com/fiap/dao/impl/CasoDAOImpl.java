package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CasoDAO;
import br.com.fiap.entity.Caso;
import br.com.fiap.exception.CodigoInvalidoException;

public class CasoDAOImpl extends GenericDAOImpl<Caso, Integer> implements CasoDAO {

	public CasoDAOImpl(EntityManager em) {
		super(em);
		
	}	
}
