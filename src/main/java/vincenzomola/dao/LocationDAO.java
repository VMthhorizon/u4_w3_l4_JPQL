package vincenzomola.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vincenzomola.entities.Location;
import vincenzomola.entities.Persona;
import vincenzomola.exceptions.NotFoundException;

import java.util.UUID;

public class LocationDAO {

    private EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Location location) {
        EntityTransaction t = this.em.getTransaction();
        t.begin();
        em.persist(location);
        t.commit();
        System.out.println("La Location " + location + " è stata salvata");
    }

    public Location findById(String id) {
        Location fromDB = this.em.find(Location.class, UUID.fromString(id));
        if (fromDB == null) throw new NotFoundException(id);
        return fromDB;
    }
}
