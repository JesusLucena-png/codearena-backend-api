package codearena.domain.port.in;

import codearena.domain.model.User;

public interface UserUseCase {

    User craer(User user);

    User actualizar(User user);

    void eliminar(Long id);

    User buscarPorId(Long id);

    User buscarPorIdentificador(String identificador);

    User buscarPorUserName(String userName);

    User buscarPorCorreoElectronico(String correoElectronico);

}
