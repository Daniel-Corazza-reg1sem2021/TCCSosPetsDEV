package repositorio;


import javax.persistence.EntityManager;

import tcc1.UsuarioDAO;

public abstract class UsuarioRepositorio implements Repositorio {
	
	private EntityManager em;
	
	
	public UsuarioRepositorio (EntityManager em) {
		this.em = em;
	}
				
	
	
	public Repositorio selectById(Long id) {
		// TODO Auto-generated method stub
		return (Repositorio) em.find(UsuarioDAO.class, id);
	}
	

	public Repositorio updateUsuario(UsuarioDAO u) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Repositorio saveUsuario(UsuarioDAO u) {
		// TODO Auto-generated method stub
		if (u.getId_usuario() == 0) {
			em.persist(u);
		} else {
			u = em.merge(u);
		} 
		return (Repositorio) u;
		}
}



