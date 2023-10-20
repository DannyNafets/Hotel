package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Reserva;

public class ReservaDao {
	
	private EntityManager em;
	
	public ReservaDao(EntityManager em) {
		this.em = em;
	}
	
	public void guardar(Reserva reserva) {
		this.em.persist(reserva);
	}

	public List<Reserva> listar() {
		String jpql = "SELECT R FROM Reserva AS R";
    	return em.createQuery(jpql, Reserva.class).getResultList();
	}

	public void editar(Reserva reserva) {
		this.em.merge(reserva);
	}

	public void eliminar(Reserva reserva) {
		reserva=this.em.merge(reserva);
		this.em.remove(reserva);
		
	}

	public void agragaHuespedIdReserva(Reserva reserva) {
		this.em.merge(reserva);
		
	}


}
