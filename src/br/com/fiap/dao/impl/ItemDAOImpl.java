package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ItemDAO;
import br.com.fiap.entity.Item;
import br.com.fiap.exception.CodigoInvalidoException;

public class ItemDAOImpl extends GenericDAOImpl<Item, Integer> implements ItemDAO {

	public ItemDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}	
	
}
