package br.com.fiap.singleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	// 1- atributo est�tico fabica de gerenciador de entidades que ser� �nico
	private static EntityManagerFactory emf;

	// 2- construtor vazio e privado
	private EntityManagerFactorySingleton() {
	}

	// 3- m�todo est�tico que retorna a �nica instancia
	public static EntityManagerFactory getInstance() {
		if (emf == null) {
			// Cria a fabrica com os dados do persistence
			emf = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return emf;

	}

}
