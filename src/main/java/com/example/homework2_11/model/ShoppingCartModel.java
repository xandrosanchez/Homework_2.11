package com.example.homework2_11.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Data
@Component
public class ShoppingCartModel {

    private Set<Integer> productIdList;

    public ShoppingCartModel() {
        productIdList = new HashSet<>();
    }

    public void addProduct(Set<Integer> resultList) {
        if (productIdList.isEmpty()) {
            productIdList = resultList;
        } else {
            productIdList.addAll(resultList);
        }
    }
}
