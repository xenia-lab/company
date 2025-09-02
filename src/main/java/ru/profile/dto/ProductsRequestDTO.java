package ru.profile.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductsRequestDTO {

    @Size(min = 1, max = 100, message = "Название продукта должно быть от 1 до 100 символов")
    @NotBlank(message = "Название продукта не может быть пустым")
    private String nameProduct;

    private Long companyId;
}
