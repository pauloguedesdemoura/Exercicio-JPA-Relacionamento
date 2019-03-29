package br.com.fiap.singleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	// 1- atributo estático fabica de gerenciador de entidades que será único
	private static EntityManagerFactory emf;

	// 2- construtor vazio e privado
	private EntityManagerFactorySingleton() {
	}

	// 3- método estático que retorna a única instancia
	public static EntityManagerFactory getInstance() {
		if (emf == null) {
			// Cria a fabrica com os dados do persistence
			emf = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return emf;

	}

}
