package vincenzomola;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jdk.jfr.Event;
import vincenzomola.dao.EventoDAO;
import vincenzomola.dao.LocationDAO;
import vincenzomola.dao.PartecipazioneDAO;
import vincenzomola.dao.PersonaDAO;
import vincenzomola.entities.Evento;
import vincenzomola.entities.Location;
import vincenzomola.entities.Partecipazione;
import vincenzomola.entities.Persona;
import vincenzomola.enums.Sesso;
import vincenzomola.enums.Stato;
import vincenzomola.enums.TipoEvento;
import vincenzomola.exceptions.NotFoundException;

import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4_w3_l4_punity");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

        EventoDAO eventDao = new EventoDAO(em);
        PersonaDAO personaDao = new PersonaDAO(em);
        LocationDAO locationDao = new LocationDAO(em);
        PartecipazioneDAO partecipazioneDao = new PartecipazioneDAO(em);

        Persona p1 = new Persona("paola", "lorro", LocalDate.of(1998, 8, 19), Sesso.F);
        Persona p2 = new Persona("luca", "posa", LocalDate.of(1997, 1, 22), Sesso.M);
        Persona p3 = new Persona("rob", "terro", LocalDate.of(1996, 3, 1), Sesso.M);
        Persona p4 = new Persona("simone", "miglio", LocalDate.of(1995, 5, 4), Sesso.M);
        Persona p5 = new Persona("cristina", "tino", LocalDate.of(1994, 9, 12), Sesso.F);

        Location l1 = new Location("stadio", "milano");
        Location l2 = new Location("ufficio", "napoli");
        Location l3 = new Location("campo", "firenze");


//        personaDao.save(p1);
//        personaDao.save(p2);
//        personaDao.save(p3);
//        personaDao.save(p4);
//        personaDao.save(p5);

//        locationDao.save(l1);
//        locationDao.save(l2);
//        locationDao.save(l3);

//        try {
//            Location loc1FromDb = locationDao.findById("0fa23864-1de5-47e5-9e09-d753ee38b7d4");
//            Location loc2FromDb = locationDao.findById("d400e668-939d-404d-b389-ec2fe9ad68bc");
//            Location loc3FromDb = locationDao.findById("e13867c7-1aa3-4c7e-9f1f-5f4fa8de7bcd");
//
//            Evento e1 = new Evento("Concerto", LocalDate.of(2026, 11, 11), "concerto Ligabue", TipoEvento.PUBBLICO,
//                    40000,
//                    loc1FromDb);
//            Evento e4 = new Evento("Riunione", LocalDate.of(2026, 10, 11), "meeting di lavoro", TipoEvento.PRIVATO,
//                    30,
//                    loc2FromDb);
//            Evento e5 = new Evento("Calcetto", LocalDate.of(2026, 9, 11), "partita calcio", TipoEvento.PRIVATO,
//                    10,
//                    loc3FromDb);
//
//            eventDao.save(e4);
//            eventDao.save(e5);
//
//        } catch (NotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }


//        try {
//            Persona personFromDb = personaDao.findById("b9bb2c71-0c67-46af-96f0-8ba233392c8a");
//            Evento eventFromDb = eventDao.findById("38053160-1107-49dc-a015-14ccfcc21507");
//
//            Partecipazione i1 = new Partecipazione(personFromDb, eventFromDb, Stato.CONFERMA);
//            Partecipazione i2 = new Partecipazione(personFromDb, eventFromDb, Stato.DA_CONFERMARE);
//
//            partecipazioneDao.save(i1);
//            partecipazioneDao.save(i2);
//
//        } catch (NotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }

        
    }
}
