package io.github.leitess.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;
import io.github.leitess.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
