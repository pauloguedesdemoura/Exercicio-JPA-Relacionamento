package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.SistemaDAO;
import br.com.fiap.entity.Caso;
import br.com.fiap.entity.Sistemas;
import br.com.fiap.exception.CodigoInvalidoException;

public class SistemaDAOImpl extends GenericDAOImpl<Sistemas, Integer> implements SistemaDAO {

	public SistemaDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}


}
