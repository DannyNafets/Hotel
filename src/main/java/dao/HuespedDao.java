package dao;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Huesped;
import modelo.Reserva;

public class HuespedDao {
	
	private EntityManager em;
	
	public HuespedDao(EntityManager em) {
		this.em = em;
	}
	
	public void guardar(Huesped huesped) {
		this.em.persist(huesped);
	}

	public List<Huesped> listar() {
		String jpql = "SELECT H FROM Huesped AS H";
    	return em.createQuery(jpql, Huesped.class).getResultList();
	}

	public void editar(Huesped huesped) {
		this.em.merge(huesped);	
	}

	public void eliminar(Huesped huesped) {
		huesped = this.em.merge(huesped);
		this.em.remove(huesped);
	}

	
}
