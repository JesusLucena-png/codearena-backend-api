package codearena.domain.port.in;

/*
 * RUTA:
 * codearena
 * └── domain
 *     └── port
 *         └── in
 *             └── ExampleUseCase.java
 *
 * CAPA:
 * Domain
 *
 * RESPONSABILIDAD:
 * Esta interfaz representa un PUERTO DE ENTRADA de la
 * Arquitectura Hexagonal.
 *
 * Define las operaciones que el sistema permite ejecutar
 * desde el exterior.
 *
 * El puerto de entrada establece QUÉ puede hacer la aplicación,
 * pero no define CÓMO se realiza la operación.
 *
 * IMPORTANTE:
 * Al estar dentro de domain, esta interfaz no depende de
 * Spring, JPA, PostgreSQL ni ninguna tecnología externa.
 *
 * FLUJO:
 *
 * Adaptador de entrada
 *        ↓
 * ExampleUseCase
 *        ↓
 * ExampleService
 *        ↓
 * ExampleRepositoryPort
 *        ↓
 * Adaptador de salida
 */

import codearena.domain.model.ExampleModel;

public interface ExampleUseCase {

    /*
     * Define el caso de uso para buscar un ejemplo por su ID.
     *
     * La implementación de esta operación estará en la
     * capa de aplicación, concretamente en ExampleService.
     */
    ExampleModel getExample(Long id);
}