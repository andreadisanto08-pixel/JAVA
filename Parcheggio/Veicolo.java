import java.time.*;

public abstract class Veicolo{
    private String targa;
    private LocalDateTime orarioIngresso;

    public abstract Double calcoloTariffa(LocalDateTime orarioUscita);
}




