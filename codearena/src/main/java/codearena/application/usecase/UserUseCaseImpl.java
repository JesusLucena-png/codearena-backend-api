package codearena.application.usecase;

import codearena.domain.model.User;
import codearena.domain.port.in.UserUseCase;
import codearena.domain.port.out.UserRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class UserUseCaseImpl implements UserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public UserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User craer(User user) {
        return userRepositoryPort.craer(user);
    }

    @Override
    public User actualizar(User user) {
        return userRepositoryPort.actualizar(user);
    }

    @Override
    public void eliminar(Long id) {
        userRepositoryPort.eliminar(id);
    }

    @Override
    public User buscarPorId(Long id) {
        return userRepositoryPort.buscarPorId(id);
    }

    @Override
    public User buscarPorIdentificador(String identificador) {
        return userRepositoryPort.buscarPorIdentificador(identificador);
    }

    @Override
    public User buscarPorUserName(String userName) {
        return userRepositoryPort.buscarPorUserName(userName);
    }

    @Override
    public User buscarPorCorreoElectronico(String correoElectronico) {
        return userRepositoryPort.buscarPorCorreoElectronico(correoElectronico);
    }
}
