package spring.service;

import spring.model.Product;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(UUID id);

    void deleteById(UUID id);

    Product save(Product user);

    Product findByName(String name);

    Collection<Product> findByStocked();

    Collection<Product> findWithUser();
}
