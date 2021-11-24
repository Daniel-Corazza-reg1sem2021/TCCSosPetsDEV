package repositorio;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class Repositorio<T, U> {

	public abstract Class<T> getGeneric();

	protected EntityManager em;

	public Repositorio(EntityManager em) {
		this.em = em;
	}

	public T findById(U id) {
		return this.em.find(getGeneric(), id);
	}

	public List<T> findAll() {
		return this.em.createQuery("Select u from " + getGeneric().getSimpleName() + "u", getGeneric()).getResultList();
	}

	public void save(T u) {
		this.em.getTransaction().begin();
		this.em.persist(u);
		this.em.getTransaction().commit();

	}

	public void update(T u) {
		this.em.getTransaction().begin();
		this.em.merge(u);
		this.em.getTransaction().commit();
	}

	public void delete(T u) {
		this.em.getTransaction().begin();
		this.em.remove(u);
		this.em.getTransaction().commit();
	}

}
