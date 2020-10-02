package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.model.Product;
import spring.repository.ProductRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    //ProductRepository pr = new ProductRepository(....)
    //ProductServiceImpl psi = new ProductServiceImpl(productRepository)

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
    public Collection<Product> findByStocked() {
       return productRepository.findAll().stream().filter(x -> x.getAvailable() > 0).collect(Collectors.toList());
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
        if (product.getAvailable() >= 1) {
            return productRepository.save(product);
        } else {
            return null;
        }
    }

}
