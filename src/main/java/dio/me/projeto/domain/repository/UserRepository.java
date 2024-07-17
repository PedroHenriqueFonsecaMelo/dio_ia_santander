package dio.me.projeto.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.me.projeto.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
