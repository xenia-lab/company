package ru.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.profile.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    Company getCompanyById(Long id);
}
