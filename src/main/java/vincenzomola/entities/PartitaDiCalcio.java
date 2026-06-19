package vincenzomola.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import vincenzomola.enums.TipoEvento;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("calcio")
public class PartitaDiCalcio extends Evento {

    private String squadraCasa;
    private String squadraOspite;
    private String squadraVincente;
    private int golCasa;
    private int golOspite;

    protected PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String titolo, LocalDate data_evento, String descrizione, TipoEvento event_type,
                           int numPartecipanti, Location location, String squadraCasa, String squadraOspite) {
        super(titolo, data_evento, descrizione, event_type, numPartecipanti, location);
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
    }


    public void setGolCasa(int golCasa) {
        this.golCasa = golCasa;
    }

    public void setGolOspite(int golOspite) {
        this.golOspite = golOspite;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraCasa='" + squadraCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", golCasa=" + golCasa +
                ", golOspite=" + golOspite +
                "} " + super.toString();
    }
}