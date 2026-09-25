package codearena.infrastructure.adapter.out.persistence.entity;

/*
 * RUTA:
 * codearena
 * └── infrastructure
 *     └── adapter
 *         └── out
 *             └── persistence
 *                 └── entity
 *                     └── ExampleEntity.java
 *
 * CAPA:
 * Infrastructure
 *
 * RESPONSABILIDAD:
 * Esta clase representa la estructura que utilizará JPA
 * para almacenar y recuperar información desde la base de datos.
 *
 * A diferencia de ExampleModel, esta clase SÍ puede depender
 * de tecnologías como JPA.
 *
 * IMPORTANTE:
 * ExampleEntity NO es el modelo del dominio.
 *
 * ExampleModel:
 * Representa el concepto dentro del negocio y debe mantenerse
 * independiente de tecnologías externas.
 *
 * ExampleEntity:
 * Representa cómo ese concepto será almacenado en la base de datos
 * y puede utilizar anotaciones como @Entity, @Table, @Id, etc.
 *
 * SEPARACIÓN:
 *
 * DOMAIN
 * ExampleModel
 *      ↓
 * INFRASTRUCTURE
 * ExampleEntity
 *      ↓
 * PostgreSQL
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "examples")
public class ExampleEntity {

    /*
     * Identificador de la entidad en la base de datos.
     *
     * @Id indica que este campo es la clave primaria.
     *
     * @GeneratedValue indica que el valor será generado
     * automáticamente por la base de datos/JPA.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /*
     * Constructor vacío requerido por JPA.
     */
    protected ExampleEntity() {
    }

    public ExampleEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}