package ru.profile.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.profile.dto.ProductsRequestDTO;
import ru.profile.dto.ProductsResponseDTO;
import ru.profile.mapper.ProductsMapper;
import ru.profile.model.Products;
import ru.profile.service.ProductsService;

@Validated
@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductsController {

    private final ProductsService productsService;
    private final ProductsMapper productsMapper;

    @GetMapping("/get/{id}")
    public ResponseEntity<ProductsResponseDTO> getProducts(@PathVariable("id") Long id) {
        return new ResponseEntity<>(
                productsMapper.toProductsResponseDTO(productsService.getProducts(id)), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Long> addProducts(@Valid @RequestBody ProductsRequestDTO productsRequestDTO){
        return new ResponseEntity<>(
                productsService.addProducts(productsRequestDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProducts(@PathVariable("id") Long id) {
        productsService.deleteProducts(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Long> updateProducts(@PathVariable("id")Long id,
                                               @RequestBody ProductsRequestDTO dto) {
        return new ResponseEntity<>(
                productsService.putProducts(id, dto), HttpStatus.OK);
    }
}
