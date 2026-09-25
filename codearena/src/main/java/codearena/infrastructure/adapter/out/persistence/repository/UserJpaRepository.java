package codearena.infrastructure.adapter.out.persistence.repository;

import codearena.infrastructure.adapter.out.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJpaRepository
        extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByIdentificador(String identificador);

    Optional<UserEntity> findByUserName(String userName);

    Optional<UserEntity> findByCorreoElectronico(String correoElectronico);
}
