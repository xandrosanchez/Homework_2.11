package com.example.homework2_11.service;

import com.example.homework2_11.model.ShoppingCartModel;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;

@org.springframework.stereotype.Service
@SessionScope
public class Service {

    private final ShoppingCartModel shoppingCart;

    public Service() {
        shoppingCart = new ShoppingCartModel();
    }

    public void add(Set<Integer> id) {
        shoppingCart.addProduct(id);
    }

    public Set<Integer> get() {
        return shoppingCart.getProductIdList();
    }
}
