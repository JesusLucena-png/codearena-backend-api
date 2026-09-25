package codearena.infrastructure.adapter.out.persistence.adapter;

import codearena.domain.model.User;
import codearena.domain.port.out.UserRepositoryPort;
import codearena.infrastructure.adapter.out.persistence.entity.UserEntity;
import codearena.infrastructure.adapter.out.persistence.repository.UserJpaRepository;
import org.springframework.stereotype.Component;


@Component
public class UserPersistenceAdapter implements UserRepositoryPort {

    public final UserJpaRepository userJpaRepository;

    public UserPersistenceAdapter(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @Override
    public User craer(User user) {
        UserEntity entity = toEntity(user);

        UserEntity savedEntity = userJpaRepository.save(entity);

        return toDomain(savedEntity);
    }

    @Override
    public User actualizar(User user) {
        UserEntity entity = toEntity(user);

        UserEntity updatedEntity = userJpaRepository.save(entity);

        return toDomain(updatedEntity);
    }

    @Override
    public void eliminar(Long id) {
        userJpaRepository.deleteById(id);
    }

    @Override
    public User buscarPorId(Long id) {
        return userJpaRepository.findById(id)
                .map(this::toDomain)
                .orElse(null);
    }

    @Override
    public User buscarPorIdentificador(String identificador) {
        return userJpaRepository.findByIdentificador(identificador)
                .map(this::toDomain)
                .orElse(null);
    }

    @Override
    public User buscarPorUserName(String userName) {
        return userJpaRepository.findByUserName(userName)
                .map(this::toDomain)
                .orElse(null);
    }

    @Override
    public User buscarPorCorreoElectronico(String correoElectronico) {
        return userJpaRepository.findByCorreoElectronico(correoElectronico)
                .map(this::toDomain)
                .orElse(null);
    }

    private UserEntity toEntity(User user) {
        return new UserEntity(
                user.getIdentificador(),
                user.getNombre(),
                user.getUserName(),
                user.getCorreoElectronico(),
                user.getContrasena(),
                user.getRol(),
                user.getNivel(),
                user.getExperiencia(),
                user.isEstado()
        );
    }

    private User toDomain(UserEntity entity) {
        User user = new User();

        user.setId(entity.getId());
        user.setIdentificador(entity.getIdentificador());
        user.setNombre(entity.getNombre());
        user.setUserName(entity.getUserName());
        user.setCorreoElectronico(entity.getCorreoElectronico());
        user.setContrasena(entity.getContrasena());
        user.setRol(entity.getRol());
        user.setNivel(entity.getNivel());
        user.setExperiencia(entity.getExperiencia());
        user.setEstado(entity.isEstado());

        return user;
    }
}
