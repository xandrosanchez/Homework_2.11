package com.example.homework2_11.controller;

import com.example.homework2_11.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/order")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping(path = "/add")
    public void addItem(@RequestParam Set<Integer> id) {
        service.add(id);
    }

    @GetMapping(path = "/get")
    public Object getItems() {
        return service.get();
    }
}