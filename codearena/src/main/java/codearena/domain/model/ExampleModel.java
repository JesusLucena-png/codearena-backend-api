package codearena.domain.model;

/*
 * MODEL
 *
 * Esta clase representa un objeto del DOMINIO de CodeArena.
 *
 * La carpeta "domain.model" contiene los objetos principales
 * del negocio, por ejemplo:
 *
 * User
 * Challenge
 * Category
 * Participation
 * Solution
 * Achievement
 *
 * El dominio debe ser independiente de frameworks y tecnologías
 * externas como Spring, JPA o PostgreSQL.
 *
 * Por eso esta clase NO utiliza:
 *
 * @Entity
 * @Table
 * @Service
 * @Repository
 * @Getter
 * @Setter
 *
 * El objetivo es que el dominio contenga únicamente las reglas
 * y estructuras propias del negocio.
 */
public class ExampleModel {

    private Long id;
    private String name;

    /*
     * Constructor:
     *
     * Permite crear un objeto ExampleModel estableciendo
     * sus valores iniciales.
     */
    public ExampleModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
     * GETTER
     *
     * Permite consultar el valor de "id" desde otras clases.
     *
     * Usamos métodos explícitos en este ejemplo para entender
     * cómo funciona Java internamente, en lugar de ocultar
     * estos métodos detrás de Lombok.
     */
    public Long getId() {
        return id;
    }

    /*
     * GETTER
     *
     * Permite consultar el nombre del objeto.
     */
    public String getName() {
        return name;
    }

}
