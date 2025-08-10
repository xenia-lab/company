package ru.profile.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.profile.model.Products;
import ru.profile.service.ProductsService;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductsController {

    private final ProductsService productsService;

    @GetMapping("/get/{id}")
    public Products getProducts(@PathVariable("id") Long id) {
        return productsService.getProducts(id);
    }

    @PostMapping("")
    public Long addProducts(@RequestBody Products products){
        return productsService.addProducts(products);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProducts(@PathVariable("id") Long id){
        productsService.deleteProducts(id);
    }
}
