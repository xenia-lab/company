package ru.profile.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.profile.dto.ProductsRequestDTO;
import ru.profile.dto.ProductsResponseDTO;
import ru.profile.mapper.ProductsMapper;
import ru.profile.model.Products;
import ru.profile.service.ProductsService;

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
    public ResponseEntity<Long> addProducts(@RequestBody ProductsRequestDTO productsRequestDTO){
        return new ResponseEntity<>(
                productsService.addProducts(productsMapper.toProducts(productsRequestDTO)), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProducts(@PathVariable("id") Long id) {
        boolean deleted = productsService.deleteProducts(id);
        if (deleted){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Long> updateProducts(@PathVariable("id")Long id,
                                               @RequestBody ProductsRequestDTO productsRequestDTO) {
        return new ResponseEntity<>(
                productsService.putProducts(id, productsMapper.toProducts(productsRequestDTO)), HttpStatus.OK);
    }
}
