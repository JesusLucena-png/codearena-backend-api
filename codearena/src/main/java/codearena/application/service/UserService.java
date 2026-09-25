package codearena.application.service;

import codearena.application.usecase.UserUseCaseImpl;
import codearena.domain.model.User;
import codearena.domain.port.in.UserUseCase;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserUseCase {

    private final UserUseCaseImpl userUseCase;

    public UserService(UserUseCaseImpl userUseCase) {
        this.userUseCase = userUseCase;
    }

    @Override
    public User craer(User user){
        return userUseCase.craer(user);
    }

    @Override
    public User actualizar(User user){
        return userUseCase.actualizar(user);
    };

    @Override
    public void eliminar(Long id){
        userUseCase.eliminar(id);
    };

    @Override
    public User buscarPorId(Long id){
        return userUseCase.buscarPorId(id);
    };

    @Override
    public User buscarPorIdentificador(String identificador){
        return userUseCase.buscarPorIdentificador(identificador);
    };

    @Override
    public User buscarPorUserName(String userName){
        return userUseCase.buscarPorUserName(userName);
    };

    @Override
    public User buscarPorCorreoElectronico(String correoElectronico){
        return userUseCase.buscarPorCorreoElectronico(correoElectronico);
    };
}
