package repositorio;

import javax.persistence.EntityManager;


import tcc1.PetsDAO;


public abstract class PetsRepositorio implements Repositorio {
	
	private EntityManager em;
	
	public PetsRepositorio (EntityManager em) {
		this.em = em;
	}

	public Repositorio selectById(Long id) {
		// TODO Auto-generated method stub
		return (Repositorio) em.find(PetsDAO.class, id);
	}

	

	public Repositorio updatePet(PetsDAO p) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public Repositorio savePet(PetsDAO p) {
		if (p.getId_pet() == 0) {
			em.persist(p);
		} else {
			p = em.merge(p);
		}
		return (Repositorio) p;
		
	}

}
