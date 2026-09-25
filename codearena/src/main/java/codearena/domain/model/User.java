package codearena.domain.model;

import codearena.infrastructure.adapter.out.persistence.entity.UserLevel;
import codearena.infrastructure.adapter.out.persistence.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {

    private Long id;
    private String identificador;
    private String nombre;
    private String userName;
    private String correoElectronico;
    private String contrasena;
    private UserRole rol;
    private UserLevel nivel;
    private Long experiencia;
    private boolean estado;
}
