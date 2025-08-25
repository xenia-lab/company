package ru.profile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.profile.exception.EntityNotFoundException;
import ru.profile.model.Products;
import ru.profile.repository.ProductsRepository;

@Service
@RequiredArgsConstructor
public class ProductsService {

    private final ProductsRepository productsRepository;

    public Products getProducts(Long id) {
        return productsRepository.getProductsById(id)
                .orElseThrow(() -> new EntityNotFoundException("Продукт с id " + id + " не найден!"));
    }

    public Long addProducts(Products products) {
        return productsRepository.save(products).getId();
    }

    public void deleteProducts(Long id) {
        if(!productsRepository.existsById(id)){
            throw new EntityNotFoundException("Продукт с id " + id + " не найден!");
        }
        productsRepository.deleteById(id);
    }

    public Long putProducts(Long id, Products products) {
        if(!productsRepository.existsById(id)){
            throw new EntityNotFoundException("Продукт с id " + id + " не найден!");
        }
        products.setId(id);
        return productsRepository.save(products).getId();
    }
}
