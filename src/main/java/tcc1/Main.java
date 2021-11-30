package tcc1;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		/*EntityManager entityMgr = getEntityManager();

		  /*try { PetsDAO testePet = new PetsDAO(1, "Cachorro salsicha", "P");
		  entityMgr.getTransaction().begin(); entityMgr.persist(testePet);
		  entityMgr.flush(); entityMgr.getTransaction().commit(); }catch (Exception ex)
		  { entityMgr.getTransaction().rollback(); }
		 

		Map<String, String> params = new HashMap<String, String>();
		params.put("email", "daniel32604@fiec.edu.br");
		params.put("senha", "123456");
		params.put("whatsapp", "19988938593");
		String query = params.keySet().stream().map(k -> k + "=?").collect(Collectors.joining(" and "));
		System.out.println("Select * from tabela where " + query);
		
		EntityManagerFactory emf = null;
		//EntityManager em = emf.createEntityManager();
		//PreparedStatement stmt = (PreparedStatement) em.createNativeQuery("Select *from tabela where " + query);
		
		int i = 1;
		for (String key : params.keySet()){
			System.out.println(i + " " + params.get(key));
			//stmt.setString(i,  params.get(key));
			i+=1;
		}
		
		UsuarioRepositorio usuario = new UsuarioRepositorio(entityMgr);
		List<UsuarioDAO> usuarios = usuario.findAll();
		System.out.println(usuarios);*/
		
		

	}
}
