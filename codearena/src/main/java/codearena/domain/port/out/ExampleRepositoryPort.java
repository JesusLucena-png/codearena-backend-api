package codearena.domain.port.out;

/*
 * RUTA:
 * codearena
 * └── domain
 *     └── port
 *         └── out
 *             └── ExampleRepositoryPort.java
 *
 * CAPA:
 * Domain
 *
 * RESPONSABILIDAD:
 * Esta interfaz representa un PUERTO DE SALIDA de la
 * Arquitectura Hexagonal.
 *
 * Define qué operaciones necesita el dominio o la aplicación
 * para comunicarse con elementos externos, como una base de datos.
 *
 * IMPORTANTE:
 * El dominio define la interfaz, pero NO conoce su implementación.
 *
 * Aquí no se utiliza JPA, Hibernate, PostgreSQL ni Spring Data.
 * La implementación estará en Infrastructure.
 *
 * FLUJO:
 *
 * ExampleService
 *       ↓
 * ExampleRepositoryPort
 *       ↓
 * ExampleRepositoryAdapter
 *       ↓
 * JPA / Spring Data
 *       ↓
 * PostgreSQL
 */

import codearena.domain.model.ExampleModel;

public interface ExampleRepositoryPort {

    /*
     * Define la operación necesaria para buscar un ejemplo
     * utilizando su identificador.
     *
     * Esta interfaz solamente define QUÉ necesitamos hacer.
     * No define CÓMO se realizará la búsqueda.
     */
    ExampleModel findById(Long id);
}