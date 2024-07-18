package dio.me.projeto.service.imp;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.me.projeto.domain.model.User;
import dio.me.projeto.domain.repository.UserRepository;
import dio.me.projeto.service.UserService;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        // TODO Auto-generated method stub
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        // TODO Auto-generated method stub
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This user ID already exists");
        }
        return userRepository.save(userToCreate);
    }

}
