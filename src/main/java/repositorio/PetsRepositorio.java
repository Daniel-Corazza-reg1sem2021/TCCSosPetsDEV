package repositorio;

import javax.persistence.EntityManager;

import tcc1.PetsDAO;

public class PetsRepositorio extends Repositorio<PetsDAO, Long> {

	public PetsRepositorio(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Class<PetsDAO> getGeneric() {
		// TODO Auto-generated method stub
		return PetsDAO.class;
	}

}
