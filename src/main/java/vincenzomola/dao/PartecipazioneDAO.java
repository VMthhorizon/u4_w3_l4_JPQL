package vincenzomola.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vincenzomola.entities.Partecipazione;
import vincenzomola.entities.Persona;
import vincenzomola.exceptions.NotFoundException;

import java.util.UUID;

public class PartecipazioneDAO {

    private EntityManager em;

    public PartecipazioneDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Partecipazione invitation) {
        EntityTransaction t = this.em.getTransaction();
        t.begin();
        em.persist(invitation);
        t.commit();
        System.out.println("La partecipazione " + invitation + " è stata salvata");

    }

    public Partecipazione findById(String id) {
        Partecipazione fromDB = this.em.find(Partecipazione.class, UUID.fromString(id));
        if (fromDB == null) throw new NotFoundException(id);
        return fromDB;
    }
}
