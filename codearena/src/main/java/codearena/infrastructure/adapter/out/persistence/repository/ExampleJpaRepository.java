package codearena.infrastructure.adapter.out.persistence.repository;

/*
 * RUTA:
 * codearena
 * └── infrastructure
 *     └── adapter
 *         └── out
 *             └── persistence
 *                 └── repository
 *                     └── ExampleJpaRepository.java
 *
 * CAPA:
 * Infrastructure
 *
 * RESPONSABILIDAD:
 * Esta interfaz representa el repositorio utilizado por Spring Data JPA
 * para comunicarse con la base de datos.
 *
 * A diferencia de ExampleRepositoryPort, este repositorio SÍ pertenece
 * a la infraestructura y puede depender directamente de Spring Data JPA.
 *
 * IMPORTANTE:
 *
 * ExampleRepositoryPort:
 * Define lo que necesita la aplicación.
 *
 * ExampleJpaRepository:
 * Define cómo Spring Data JPA realizará las operaciones
 * sobre la base de datos.
 *
 * El dominio no conoce esta interfaz.
 *
 * FLUJO:
 *
 * ExampleService
 *        ↓
 * ExampleRepositoryPort
 *        ↓
 * ExampleRepositoryAdapter
 *        ↓
 * ExampleJpaRepository
 *        ↓
 * ExampleEntity
 *        ↓
 * PostgreSQL
 */

import codearena.infrastructure.adapter.out.persistence.entity.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Al extender JpaRepository, Spring Data JPA proporciona
 * automáticamente operaciones como:
 *
 * save()
 * findById()
 * findAll()
 * deleteById()
 *
 * No necesitamos escribir manualmente el código SQL
 * para estas operaciones básicas.
 */
public interface ExampleJpaRepository
        extends JpaRepository<ExampleEntity, Long> {
}