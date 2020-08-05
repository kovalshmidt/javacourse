package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import spring.model.Products;
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
    public Products findByName(String name) {
        Optional<Products> optional = productRepository.findByName(name);
        return optional.orElse(null);
    }

    @Override
    public List<Products> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Products> findById(UUID id) {
        return productRepository.findById(id);
    }

    @Override
    public void deleteById(UUID id) {
        productRepository.deleteById(id);
    }

    @Override
    public Products save(Products products) {
        if(products.getAvailable() >= 10) {
            return productRepository.save(products);
        } else {
            return null;
        }
    }

}
