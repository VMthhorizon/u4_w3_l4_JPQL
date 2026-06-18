package vincenzomola.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String id) {
        super("ELEMENTO " + id + " NON TROVATO");
    }
}
