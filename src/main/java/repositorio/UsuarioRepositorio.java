package repositorio;

import javax.persistence.EntityManager;

import tcc1.UsuarioDAO;

public class UsuarioRepositorio extends Repositorio<UsuarioDAO, Long> {

	public UsuarioRepositorio(EntityManager em) {
		super(em);
	}

	@Override
	public Class<UsuarioDAO> getGeneric() {
		// TODO Auto-generated method stub
		return UsuarioDAO.class;
	}

}
