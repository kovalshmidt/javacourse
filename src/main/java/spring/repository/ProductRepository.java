package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.model.Product;

import java.util.Optional;
import java.util.UUID;

@Repository // = @Component, @Service @Controller
public interface ProductRepository extends JpaRepository<Product, UUID> {

    // SELECT * FROM user WHERE id = ?;
    Optional<Product> findByName(String name);

}
