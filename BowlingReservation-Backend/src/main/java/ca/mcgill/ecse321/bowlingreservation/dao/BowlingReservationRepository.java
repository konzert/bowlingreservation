package ca.mcgill.ecse321.bowlingreservation.dao;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ca.mcgill.ecse321.bowlingreservation.model.Player;
import ca.mcgill.ecse321.bowlingreservation.model.Reservation;

@Repository
public class BowlingReservationRepository {

	@Autowired
	EntityManager entityManager;

	@Transactional
	public Player createPlayer(String name) {
		Player p = new Player();
		p.setName(name);
		entityManager.persist(p);
		return p;
	}

	@Transactional
	public Player getPlayer(String name) {
		Player p = entityManager.find(Player.class, name);
		return p;
	}

	@Transactional
	public Reservation createReservation(String name, Date bookingDate, Time bookingTime, int partySize) {
		Reservation e = new Reservation();
		e.setName(name);
		e.setBookingDate(bookingDate);
		e.setBookingTime(bookingTime);
		entityManager.persist(e);
		return e;
	}

	@Transactional
	public Reservation getReservation(String name) {
		Reservation e = entityManager.find(Reservation.class, name);
		return e;
	}
	
	@Transactional
	public List<Reservation> getEventsBeforeADeadline(Date deadline) {
		TypedQuery<Reservation> q = entityManager.createQuery("select e from Event e where e.date < :deadline",Reservation.class);
		q.setParameter("deadline", deadline);
		List<Reservation> resultList = q.getResultList();
		return resultList;
	}

}