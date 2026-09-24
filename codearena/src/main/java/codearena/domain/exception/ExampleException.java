package codearena.domain.exception;

/*
 * EXCEPTION
 *
 * La carpeta "domain.exception" contiene las excepciones
 * relacionadas con las reglas y errores del negocio.
 *
 * Por ejemplo, en CodeArena podríamos tener:
 *
 * UserNotFoundException
 * ChallengeNotFoundException
 * ParticipationException
 * BusinessException
 *
 * Estas excepciones pertenecen al dominio porque representan
 * situaciones que tienen significado para el negocio.
 *
 * Ejemplo:
 *
 * "El jugador ya tiene una participación activa en este reto."
 *
 * No es un error de PostgreSQL ni de Spring.
 * Es una regla del negocio.
 */
public class ExampleException extends RuntimeException {

    /*
     * Constructor de la excepción.
     *
     * Recibe un mensaje que explica qué ocurrió.
     */
    public ExampleException(String message) {
        super(message);
    }
}
