package one.digitalinnovation.personapi.exception;

//@ResponseStatus(HttpStatus.NOT_FOUND);
public class PersonNotFoundException extends Exception {

    public PersonNotFoundException(Long id) {
        super("Person not found with ID" + id);
    }
}
