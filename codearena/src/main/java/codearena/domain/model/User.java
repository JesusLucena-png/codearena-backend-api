package codearena.domain.model;

import javax.management.relation.Role;
import java.math.BigDecimal;
import java.util.logging.Level;

public class User {

    private Long id;
    private String identificador;
    private String nombre;
    private String userName;
    private String correoElectronico;
    private String contrasena;
    private Role rol;
    private Level nivel;
    private Long experiencia;
    private boolean estado;

    public User(Long id, String identificador, String nombre, String userName, String correoElectronico, String contrasena, Role rol, Level nivel, Long experiencia, boolean estado) {
        this.id = id;
        this.identificador = identificador;
        this.nombre = nombre;
        this.userName = userName;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.rol = rol;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUserName() {
        return userName;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Role getRol() {
        return rol;
    }

    public Level getNivel() {
        return nivel;
    }

    public Long getExperiencia() {
        return experiencia;
    }

    public boolean isEstado() {
        return estado;
    }
}
