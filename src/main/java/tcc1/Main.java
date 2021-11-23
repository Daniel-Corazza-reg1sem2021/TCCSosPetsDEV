package tcc1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
	try {	
		UsuarioDAO teste = new UsuarioDAO(1, "Joao");
		entityMgr.getTransaction().begin();
		entityMgr.persist(teste);
		entityMgr.flush();
		entityMgr.getTransaction().commit();
	}catch (Exception ex) {
		entityMgr.getTransaction().rollback();
	}
}
}


