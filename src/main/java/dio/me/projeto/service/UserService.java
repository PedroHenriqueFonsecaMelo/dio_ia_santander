package dio.me.projeto.service;

import dio.me.projeto.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create (User userToCreate);
}
