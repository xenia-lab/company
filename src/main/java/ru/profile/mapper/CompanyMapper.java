package ru.profile.mapper;

import org.mapstruct.Mapper;
import ru.profile.dto.CompanyRequestDTO;
import ru.profile.dto.CompanyResponseDTO;
import ru.profile.model.Company;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    Company toCompany(CompanyRequestDTO companyRequestDTO);

    CompanyResponseDTO toCompanyResponseDTO(Company company);

}
