package codearena.application.service;

/*
 * RUTA:
 * codearena
 * └── application
 *     └── service
 *         └── ExampleService.java
 *
 * CAPA:
 * Application
 *
 * RESPONSABILIDAD:
 * Esta clase contiene la implementación del caso de uso.
 *
 * ExampleUseCase define QUÉ operación puede realizar la aplicación.
 * ExampleService define CÓMO se ejecuta esa operación.
 *
 * Esta clase coordina la lógica de aplicación y utiliza los puertos
 * de salida para comunicarse con elementos externos al dominio.
 *
 * IMPORTANTE:
 * No accede directamente a PostgreSQL, JPA ni Hibernate.
 * Para obtener los datos utiliza ExampleRepositoryPort.
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
 * Adaptador de persistencia
 *        ↓
 * PostgreSQL
 */

import codearena.application.usecase.ExampleUseCaseImpl;
import codearena.domain.model.ExampleModel;
import codearena.domain.port.in.ExampleUseCase;
import org.springframework.stereotype.Service;

/*
 * @Service indica que Spring debe registrar esta clase como
 * un componente de la aplicación.
 *
 * Además, permite que Spring gestione la inyección de sus dependencias.
 */
@Service
public class ExampleService implements ExampleUseCase{

    /*
     * PUERTO DE SALIDA:
     *
     * ExampleRepositoryPort es una abstracción que define las
     * operaciones que necesita la aplicación para acceder a los datos.
     *
     * ExampleService no conoce la implementación concreta.
     */
    private final ExampleUseCaseImpl exampleUseCaseImpl;

    /*
     * INYECCIÓN DE DEPENDENCIAS:
     *
     * Recibimos ExampleRepositoryPort mediante el constructor.
     *
     * Spring proporcionará automáticamente la implementación
     * correspondiente del puerto.
     */
    public ExampleService(ExampleUseCaseImpl exampleUseCaseImpl) {
        this.exampleUseCaseImpl = exampleUseCaseImpl;
    }

    /*
     * IMPLEMENTACIÓN DEL CASO DE USO:
     *
     * Este método cumple el contrato definido por ExampleUseCase.
     *
     * La búsqueda se delega al puerto de salida, manteniendo
     * desacoplada la capa de aplicación de la persistencia.
     */
    @Override
    public ExampleModel getExample(Long id) {
        return exampleUseCaseImpl.getExample(id);
    }
}