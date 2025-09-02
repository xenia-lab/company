package ru.profile.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.profile.dto.ProductsRequestDTO;
import ru.profile.exception.EntityNotFoundException;
import ru.profile.mapper.ProductsMapper;
import ru.profile.model.Company;
import ru.profile.model.Products;
import ru.profile.repository.CompanyRepository;
import ru.profile.repository.ProductsRepository;

@Service
@RequiredArgsConstructor
public class ProductsService {

    private final ProductsRepository productsRepository;
    private final CompanyRepository companyRepository;
    private final ProductsMapper productsMapper;

    public Products getProducts(Long id) {
        return productsRepository.getProductsById(id)
                .orElseThrow(() -> new EntityNotFoundException("Продукт с id " + id + " не найден!"));
    }

    public Long addProducts(ProductsRequestDTO dto) {
        Company company = companyRepository.findById(dto.getCompanyId())
                .orElseThrow(() -> new EntityNotFoundException("Company с id " + dto.getCompanyId() + " не найден"));

        Products product = productsMapper.toProducts(dto);
        product.setCompany(company);

        Products saved = productsRepository.save(product);
        return saved.getId();
    }

    public void deleteProducts(Long id) {
        if(!productsRepository.existsById(id)){
            throw new EntityNotFoundException("Продукт с id " + id + " не найден!");
        }
        productsRepository.deleteById(id);
    }

    public Long putProducts(Long id, ProductsRequestDTO dto) {

        Products existingProduct = productsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Продукт с id " + id + " не найден"));

        Company company = companyRepository.findById(dto.getCompanyId())
                .orElseThrow(() -> new EntityNotFoundException("Компания с id " + id + " не найдена"));

        existingProduct.setNameProduct(dto.getNameProduct());
        existingProduct.setCompany(company);
        Products update = productsRepository.save(existingProduct);
        return update.getId();
    }
}
