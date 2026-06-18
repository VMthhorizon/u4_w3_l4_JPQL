package vincenzomola.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

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

    public PartitaDiCalcio(String squadraCasa, String squadraOspite, String squadraVincente, int golCasa, int golOspite){
        super()
    }

}
