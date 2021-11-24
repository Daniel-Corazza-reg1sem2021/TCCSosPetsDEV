package tcc1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import repositorio.UsuarioRepositorio;


public class Main {

	private static final EntityManagerFactory emFactoryObj;
	private static final String PERSISTENCE_UNIT_NAME = "sos_pets";

	static {
		emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	// This Method Is Used To Retrieve The 'EntityManager' Object
	public static EntityManager getEntityManager() {
		return emFactoryObj.createEntityManager();
	}

	public static void main(String[] args) {
		EntityManager entityMgr = getEntityManager();
		/*
		 * try { PetsDAO testePet = new PetsDAO(1, "Cachorro salsicha", "P");
		 * entityMgr.getTransaction().begin(); entityMgr.persist(testePet);
		 * entityMgr.flush(); entityMgr.getTransaction().commit(); }catch (Exception ex)
		 * { entityMgr.getTransaction().rollback(); }
		 */

		
	

		

	}
}
