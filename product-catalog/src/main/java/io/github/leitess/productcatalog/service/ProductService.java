package io.github.leitess.productcatalog.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.leitess.productcatalog.model.Product;
import io.github.leitess.productcatalog.repository.ProductRepository;

import java.util.Optional;

@Service
public class ProductService 
{

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product create(Product product)
    {
        return productRepository.save(product);
    }

    public Optional<Product> findbyId(Integer id)
    {
        return productRepository.findById(id);
    }

    public Iterable<Product> listAll() { return productRepository.findAll(); }

    public Iterable<Product> findByName(String name) { return productRepository.findByName(name); }
}
