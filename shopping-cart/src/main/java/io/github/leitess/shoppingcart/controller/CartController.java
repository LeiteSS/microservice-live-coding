package io.github.leitess.shoppingcart.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.github.leitess.shoppingcart.model.Cart;
import io.github.leitess.shoppingcart.model.Item;
import io.github.leitess.shoppingcart.service.CartService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.Optional;

@RestController
@RequestMapping(value = "/cart")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CartController 
{
    private CartService cartService;

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Cart addItem(@PathVariable Long id, @RequestBody Item item) 
    {
        return cartService.addItem(id, item);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Cart> findById(@PathVariable Long id) 
    {
        return cartService.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void clear(@PathVariable Long id) 
    {
        cartService.clear(id);
    }
}
