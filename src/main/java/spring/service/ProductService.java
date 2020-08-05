package spring.service;

import spring.model.Products;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {

    List<Products> findAll();

    Optional<Products> findById(UUID id);

    void deleteById(UUID id);

    Products save(Products user);

    Products findByName(String name);
}
