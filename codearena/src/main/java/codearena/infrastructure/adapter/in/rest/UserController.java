package codearena.infrastructure.adapter.in.rest;

import codearena.application.service.UserService;
import codearena.domain.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> crear(@RequestBody User user) {
        User usuarioCreado = userService.craer(user);
        return new ResponseEntity<>(usuarioCreado, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> actualizar(@RequestBody User user) {
        User usuarioActualizado = userService.actualizar(user);
        return new ResponseEntity<>(usuarioActualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable  Long id){
        userService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> buscarPorId(@PathVariable Long id) {
        User user = userService.buscarPorId(id);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/identificador/{identificador}")
    public ResponseEntity<User> buscarPorIdentificador(@PathVariable String identificador) {

        User user = userService.buscarPorIdentificador(identificador);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/username/{userName}")
    public ResponseEntity<User> buscarPorUserName(@PathVariable String userName) {

        User user = userService.buscarPorUserName(userName);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/correo/{correoElectronico}")
    public ResponseEntity<User> buscarPorCorreoElectronico(@PathVariable String correoElectronico) {

        User user = userService.buscarPorCorreoElectronico(correoElectronico);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
