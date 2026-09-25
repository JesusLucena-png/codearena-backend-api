package codearena.application.usecase;

import codearena.domain.model.ExampleModel;
import codearena.domain.port.in.ExampleUseCase;
import codearena.domain.port.out.ExampleRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class ExampleUseCaseImpl implements ExampleUseCase {

    /*
     * PUERTO DE SALIDA:
     *
     * ExampleRepositoryPort es una abstracción que define las
     * operaciones que necesita la aplicación para acceder a los datos.
     *
     * ExampleService no conoce la implementación concreta.
     */
    private final ExampleRepositoryPort repositoryPort;

    /*
     * INYECCIÓN DE DEPENDENCIAS:
     *
     * Recibimos ExampleRepositoryPort mediante el constructor.
     *
     * Spring proporcionará automáticamente la implementación
     * correspondiente del puerto.
     */
    public ExampleUseCaseImpl(ExampleRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
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
        return repositoryPort.findById(id);
    }
}

