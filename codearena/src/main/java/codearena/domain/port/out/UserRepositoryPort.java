package codearena.domain.port.out;

import codearena.domain.model.User;

public interface UserRepositoryPort {

    User craer(User user);

    User actualizar(User user);

    void eliminar(Long id);

    User buscarPorId(Long id);

    User buscarPorIdentificador(String identificador);

    User buscarPorUserName(String userName);

    User buscarPorCorreoElectronico(String correoElectronico);

}
