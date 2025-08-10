package ru.profile.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.profile.model.Company;
import ru.profile.repository.CompanyRepository;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public Company getCompany(Long id) {
        return companyRepository.getCompanyById(id);
    }

    public Long addCompany(Company company) {
        return companyRepository.save(company).getId();
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
}