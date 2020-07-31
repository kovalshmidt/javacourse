package spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import spring.model.User;
import spring.repository.UserRepository;

@Slf4j
@Component
@ConditionalOnProperty(name = "expense.db.populate", havingValue = "true")
public class DBFiller implements CommandLineRunner {

    private UserRepository userRepository;

    @Autowired
    public DBFiller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setName("Bob");
        user.setSurname("Fisher");
        user.setEmail("bob@bob.com");
        user.setAge(28);
        userRepository.save(user);
        log.info("User Bob was inserted in the database");


        User admin = new User();
        admin.setName("Max");
        admin.setSurname("Port");
        admin.setEmail("max@max.com");
        admin.setAge(28);
        userRepository.save(admin);
        log.info("User Max was inserted in the database");
    }
}
