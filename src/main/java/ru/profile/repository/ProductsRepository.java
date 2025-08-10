package ru.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.profile.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

    Products getProductsById(Long id);
}
