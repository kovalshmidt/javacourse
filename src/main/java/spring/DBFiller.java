package spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import spring.model.Product;
import spring.model.User;
import spring.repository.ProductRepository;
import spring.repository.UserRepository;

@Slf4j
@Component
@ConditionalOnProperty(name = "expense.db.populate", havingValue = "true")
public class DBFiller implements CommandLineRunner {

    private UserRepository userRepository;
    private ProductRepository productRepository;

    @Autowired
    public DBFiller(UserRepository userRepository, ProductRepository productRepository) {

        this.userRepository = userRepository;
        this.productRepository = productRepository;
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

        Product drill = new Product();
        drill.setName("Electric drill");
        drill.setDescription("Used for drilling holes in walls");
        drill.setAvailable(31);
        drill.setUser(admin);
        productRepository.save(drill);
        log.info("Product Drill was inserted in the database");

        Product screwdriver = new Product();
        screwdriver.setName("Screwdriver");
        screwdriver.setDescription("Tool for getting screws in and out");
        screwdriver.setAvailable(15);
        screwdriver.setUser(admin);
        productRepository.save(screwdriver);
        log.info("Product Screwdriver was inserted in the database");


        Product goldenWrench = new Product();
        goldenWrench.setName("Golden Wrench");
        goldenWrench.setDescription("Extremely rare");
        goldenWrench.setAvailable(0);
        productRepository.save(goldenWrench);
        log.info("Product Screwdriver was inserted in the database");

        log.info("Database initialized...");
    }
}
