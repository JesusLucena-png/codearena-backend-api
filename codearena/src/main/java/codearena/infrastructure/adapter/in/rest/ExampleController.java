package codearena.infrastructure.adapter.in.rest;

/*
 * RUTA:
 * codearena
 * └── infrastructure
 *     └── adapter
 *         └── in
 *             └── rest
 *                 └── ExampleController.java
 *
 * CAPA:
 * Infrastructure
 *
 * RESPONSABILIDAD:
 * Esta clase es un ADAPTADOR DE ENTRADA.
 *
 * Su función es recibir solicitudes HTTP desde el exterior
 * y convertirlas en llamadas al puerto de entrada de la aplicación.
 *
 * En este caso, el exterior puede ser Angular, Postman u otro
 * cliente HTTP.
 *
 * IMPORTANTE:
 * El Controller NO contiene la lógica de negocio.
 *
 * El Controller solamente:
 * 1. Recibe la petición HTTP.
 * 2. Obtiene los datos necesarios de la petición.
 * 3. Llama al puerto de entrada.
 * 4. Devuelve la respuesta.
 *
 * FLUJO:
 *
 * Angular / Postman
 *        ↓
 * ExampleController
 *        ↓
 * ExampleUseCase
 *        ↓
 * ExampleService
 *        ↓
 * ExampleRepositoryPort
 *        ↓
 * RepositoryAdapter
 *        ↓
 * PostgreSQL
 */

import codearena.application.service.ExampleService;
import codearena.domain.model.ExampleModel;
import org.springframework.web.bind.annotation.*;

/*
 * @RestController indica que esta clase funciona como
 * controlador REST de Spring.
 *
 * Las respuestas de sus métodos se convierten en respuestas HTTP,
 * normalmente en formato JSON.
 */
@RestController

/*
 * Define la ruta base de los endpoints de este controlador.
 *
 * Por ejemplo:
 * GET /api/examples/1
 */
@RequestMapping("/api/examples")
public class ExampleController {

    /*
     * Puerto de entrada de la aplicación.
     *
     * El Controller depende de la interfaz ExampleUseCase
     * y no directamente de ExampleService.
     *
     * Esto mantiene desacoplado el adaptador REST de
     * la implementación concreta del caso de uso.
     */
    private final ExampleService exampleService;

    /*
     * INYECCIÓN DE DEPENDENCIAS:
     *
     * Spring proporciona la implementación de ExampleUseCase,
     * que en nuestra estructura será ExampleService.
     */
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    /*
     * ENDPOINT:
     *
     * GET /api/examples/{id}
     *
     * @GetMapping indica que este método responde a peticiones GET.
     *
     * @PathVariable obtiene el ID directamente de la URL.
     *
     * Ejemplo:
     * GET /api/examples/10
     *
     * id = 10
     */
    @GetMapping("/{id}")
    public ExampleModel getExample(@PathVariable Long id) {

        /*
         * El Controller delega la operación al puerto de entrada.
         *
         * Aquí no se realiza lógica de negocio ni acceso a la BD.
         */
        return exampleService.getExample(id);
    }
}