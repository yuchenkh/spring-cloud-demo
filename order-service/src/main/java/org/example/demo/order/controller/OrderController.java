package org.example.demo.order.controller;

import lombok.RequiredArgsConstructor;
import org.example.demo.order.entity.Order;
import org.example.demo.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/order")
public class OrderController {

    private final OrderService service;

    @GetMapping("/get/{id}")
    public Order getById(@PathVariable("id") Long id) {
        return service.getById(id);
    }
}
