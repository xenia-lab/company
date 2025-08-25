package ru.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.profile.model.Products;

import java.util.Optional;

public interface ProductsRepository extends JpaRepository<Products, Long> {

    Optional<Products> getProductsById(Long id);
}
