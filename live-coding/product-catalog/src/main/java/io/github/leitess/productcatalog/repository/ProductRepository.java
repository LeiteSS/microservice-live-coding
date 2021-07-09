package io.github.leitess.productcatalog.repository;

import io.github.leitess.productcatalog.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {
}
