package vincenzomola.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "gara")
public class GaraDiAtletica extends Evento {

    @ManyToMany
    @JoinTable(name = "gara_persona", joinColumns = @JoinColumn(name = "gara_id"), inverseJoinColumns =
    @JoinColumn(name = "atleta_id"))
    private Set<Persona> atleti;

    @ManyToOne
    @JoinColumn(name = "vincitore")
    private Persona vincitore;

}
