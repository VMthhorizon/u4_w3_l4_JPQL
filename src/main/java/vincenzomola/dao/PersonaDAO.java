package vincenzomola.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vincenzomola.entities.Evento;
import vincenzomola.entities.Location;
import vincenzomola.entities.Persona;
import vincenzomola.exceptions.NotFoundException;

import java.util.UUID;

public class PersonaDAO {
    private EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Persona person) {
        EntityTransaction t = this.em.getTransaction();
        t.begin();
        em.persist(person);
        t.commit();
        System.out.println("La Persona " + person + " è stata salvata");
    }

    public Persona findById(String id) {
        Persona fromDB = this.em.find(Persona.class, UUID.fromString(id));
        if (fromDB == null) throw new NotFoundException(id);
        return fromDB;
    }
}
