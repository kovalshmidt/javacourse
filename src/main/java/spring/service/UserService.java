package spring.service;

import spring.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(UUID id);

    void deleteById(UUID id);

    User save(User user);

    User findByEmail(String email);

    List<User> getNoProductUsers();

}
