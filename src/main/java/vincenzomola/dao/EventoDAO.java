package vincenzomola.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vincenzomola.entities.Evento;
import vincenzomola.entities.Partecipazione;
import vincenzomola.exceptions.NotFoundException;

import java.util.UUID;

public class EventoDAO {

    private EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento event) {
        EntityTransaction t = this.em.getTransaction();
        t.begin();
        em.persist(event);
        t.commit();
        System.out.println("L' evento " + event + " è stata salvata");

    }

    public Evento findById(String id) {
        Evento fromDB = this.em.find(Evento.class, UUID.fromString(id));
        if (fromDB == null) throw new NotFoundException(id);
        return fromDB;
    }

}
