package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.model.User;
import spring.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByEmail(String email) {
        Optional<User> optional = userRepository.findByEmail(email);
        return optional.orElse(null);
    }

    @Override
    public List<User> getNoProductUsers() {
        return findAll().stream().filter(x -> x.getProducts().isEmpty()).collect(Collectors.toList());
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(UUID uuid) {
        return userRepository.findById(uuid);
    }

    @Override
    public void deleteById(UUID id) {
        userRepository.deleteById(id);
    }

    @Override
    public User save(User user) {
        if (user.getAge() >= 18) {
            return userRepository.save(user);
        } else {
            return null;
        }
    }
}
