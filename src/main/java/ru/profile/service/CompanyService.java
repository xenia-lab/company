package ru.profile.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.profile.exception.EntityNotFoundException;
import ru.profile.model.Company;
import ru.profile.repository.CompanyRepository;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public Company getCompany(Long id) {
        return companyRepository.getCompanyById(id)
                .orElseThrow(() -> new EntityNotFoundException("Компания с id " + id + " не найдена!"));
    }

    public Long addCompany(Company company) {
        return companyRepository.save(company).getId();
    }

    public void deleteCompany(Long id) {
        if(!companyRepository.existsById(id)){
            throw new EntityNotFoundException("Компания с id " + id + " не найдена!");
        }
        companyRepository.deleteById(id);
    }

    public Long putCompany(Long id, Company company) {
        if(!companyRepository.existsById(id)){
            throw new EntityNotFoundException("компания с id " + id + " не найдена!");
        }
        company.setId(id);
        return companyRepository.save(company).getId();
    }
}