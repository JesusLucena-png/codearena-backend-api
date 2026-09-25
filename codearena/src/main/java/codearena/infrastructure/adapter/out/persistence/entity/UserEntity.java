package codearena.infrastructure.adapter.out.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(
        name = "users",
        indexes = {
                @Index(name = "idx_users_identificador", columnList = "identificador"),
                @Index(name = "idx_users_username", columnList = "username"),
                @Index(name = "idx_users_correo", columnList = "correo_electronico")
        }
)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "identificador",
            nullable = false,
            unique = true,
            length = 50
    )
    private String identificador;

    @Column(
            name = "nombre",
            nullable = false,
            length = 100
    )
    private String nombre;

    @Column(
            name = "username",
            nullable = false,
            unique = true,
            length = 50
    )
    private String userName;

    @Column(
            name = "correo_electronico",
            nullable = false,
            unique = true,
            length = 150
    )
    private String correoElectronico;

    @Column(
            name = "contrasena",
            nullable = false,
            length = 255
    )
    private String contrasena;

    @Enumerated(EnumType.STRING)
    @Column(
            name = "rol",
            nullable = false,
            length = 30
    )
    private UserRole rol;

    @Enumerated(EnumType.STRING)
    @Column(
            name = "nivel",
            nullable = false,
            length = 30
    )
    private UserLevel nivel;

    @Column(
            name = "experiencia",
            nullable = false
    )
    private Long experiencia = 0L;

    @Column(
            name = "estado",
            nullable = false
    )
    private boolean estado = true;

    protected UserEntity() {
        // Constructor requerido por JPA
    }

    public UserEntity(
            String identificador,
            String nombre,
            String userName,
            String correoElectronico,
            String contrasena,
            UserRole rol,
            UserLevel nivel,
            Long experiencia,
            boolean estado
    ) {
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

    public UserRole getRol() {
        return rol;
    }

    public UserLevel getNivel() {
        return nivel;
    }

    public Long getExperiencia() {
        return experiencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setRol(UserRole rol) {
        this.rol = rol;
    }

    public void setNivel(UserLevel nivel) {
        this.nivel = nivel;
    }

    public void setExperiencia(Long experiencia) {
        this.experiencia = experiencia;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}