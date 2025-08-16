package ru.profile.mapper;

import org.mapstruct.Mapper;
import ru.profile.dto.ProductsRequestDTO;
import ru.profile.dto.ProductsResponseDTO;
import ru.profile.model.Products;

@Mapper(componentModel = "spring")
public interface ProductsMapper {

    Products toProducts(ProductsRequestDTO productsRequestDTO);

    ProductsResponseDTO toProductsResponseDTO(Products products);
}
