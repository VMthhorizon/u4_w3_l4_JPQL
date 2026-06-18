package vincenzomola.entities;

import jakarta.persistence.*;
import vincenzomola.enums.TipoEvento;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "events")
public abstract class Evento {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private UUID event_id;
    @Column(name = "event_name")
    private String titolo;
    private LocalDate data_evento;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private TipoEvento event_type;
    private int numPartecipanti;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    protected Evento() {
    }

    public Evento(String titolo, LocalDate data_evento, String descrizione, TipoEvento event_type,
                  int numPartecipanti, Location location) {
        this.titolo = titolo;
        this.data_evento = data_evento;
        this.descrizione = descrizione;
        this.event_type = event_type;
        this.numPartecipanti = numPartecipanti;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "event_id=" + event_id +
                ", titolo='" + titolo + '\'' +
                ", data_evento=" + data_evento +
                ", descrizione='" + descrizione + '\'' +
                ", event_type=" + event_type +
                ", numPartecipanti=" + numPartecipanti +
                ", location=" + location +
                '}';
    }
}
