package ru.profile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.profile.model.Products;
import ru.profile.repository.ProductsRepository;

@Service
@RequiredArgsConstructor
public class ProductsService {

    private final ProductsRepository productsRepository;

    public Products getProducts(Long id) {
        return productsRepository.getProductsById(id);
    }

    public Long addProducts(Products products) {
        return productsRepository.save(products).getId();
    }

    public boolean deleteProducts(Long id) {
        productsRepository.deleteById(id);
        return false;
    }

    public Long putProducts(Long id, Products products) {
        products.setId(id);
        return productsRepository.save(products).getId();
    }
}
