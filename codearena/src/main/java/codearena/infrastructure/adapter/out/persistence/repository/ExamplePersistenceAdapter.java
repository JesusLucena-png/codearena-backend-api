package codearena.infrastructure.adapter.out.persistence.repository;

/*
 * RUTA:
 * codearena
 * └── infrastructure
 *     └── adapter
 *         └── out
 *             └── persistence
 *                 └── repository
 *                     └── ExamplePersistenceAdapter.java
 *
 * CAPA:
 * Infrastructure
 *
 * TIPO:
 * Adaptador de salida.
 *
 * RESPONSABILIDAD:
 * Esta clase implementa el puerto de salida definido por el dominio
 * y adapta las necesidades de la aplicación a una tecnología externa.
 *
 * En este caso:
 *
 * ExampleRepositoryPort
 *        ↓
 * ExamplePersistenceAdapter
 *        ↓
 * ExampleJpaRepository
 *        ↓
 * ExampleEntity
 *        ↓
 * PostgreSQL
 *
 * IMPORTANTE:
 * El dominio solamente conoce ExampleRepositoryPort.
 *
 * El dominio NO conoce:
 * - Spring Data JPA
 * - Hibernate
 * - PostgreSQL
 * - ExampleJpaRepository
 * - ExampleEntity
 *
 * Esta clase pertenece a Infrastructure porque es la encargada
 * de realizar la comunicación con la persistencia.
 */

import codearena.domain.model.ExampleModel;
import codearena.domain.port.out.ExampleRepositoryPort;
import org.springframework.stereotype.Component;

/*
 * @Component permite que Spring registre este adaptador
 * como un componente y pueda inyectarlo donde sea necesario.
 */
@Component
public class ExamplePersistenceAdapter implements ExampleRepositoryPort {

    /*
     * Implementación del puerto de salida.
     *
     * En este ejemplo todavía no estamos consultando la base de datos.
     * Se devuelve un ExampleModel simulado para comprobar el flujo
     * completo de la arquitectura.
     *
     * Más adelante este método utilizará ExampleJpaRepository
     * para consultar ExampleEntity y posteriormente convertirla
     * en ExampleModel.
     */
    @Override
    public ExampleModel findById(Long id) {
        return new ExampleModel(id, "Ejemplo CodeArena");
    }
}