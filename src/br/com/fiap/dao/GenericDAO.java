package br.com.fiap.dao;

import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitInvalidoException;

//TK por causa da tabela e *Kodigo Genericosss
public interface GenericDAO<T,K> {
	
	void cadastrar(T entidade);
	
	void alterar(T entidade);
	
	void remover(K codigo) throws CodigoInvalidoException;
	
	T buscar(K codigo)throws CodigoInvalidoException;
	
	void commit() throws CommitInvalidoException;

}
