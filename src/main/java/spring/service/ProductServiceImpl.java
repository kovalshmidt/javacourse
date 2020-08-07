package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import spring.model.Product;
import spring.repository.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findByName(String name) {
        Optional<Product> optional = productRepository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(UUID id) {
        return productRepository.findById(id);
    }

    @Override
    public void deleteById(UUID id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product save(Product product) {
        if(product.getAvailable() >= 10) {
            return productRepository.save(product);
        } else {
            return null;
        }
    }

}
