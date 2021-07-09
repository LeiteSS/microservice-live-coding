package io.github.leitess.shoppingcart.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.github.leitess.shoppingcart.model.Cart;
import io.github.leitess.shoppingcart.model.Item;
import io.github.leitess.shoppingcart.repository.CartRepository;

import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CartService 
{
    private CartRepository cartRepository;

    public Cart addItem(Long id, Item item) 
    {
        Optional<Cart> savedCart = cartRepository.findById(id);
        Cart cart;

        if (savedCart.equals(Optional.empty())) 
        {
            cart = new Cart(id);
        }
        else 
        {
            cart = savedCart.get();
        }

        cart.getItems().add(item);

        return cartRepository.save(cart);
    }

    public Optional<Cart> findById(Long id) 
    {
        return cartRepository.findById(id);
    }

    public void clear(Long id) 
    {
        cartRepository.deleteById(id);
    }
}
