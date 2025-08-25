package ru.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.profile.model.Company;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    Optional<Company> getCompanyById(Long id);
}
