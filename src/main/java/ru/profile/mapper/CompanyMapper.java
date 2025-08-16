package ru.profile.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.profile.dto.CompanyRequestDTO;
import ru.profile.dto.CompanyResponseDTO;
import ru.profile.model.Company;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    @Mapping(source = "name_company", target = "name_company")
    @Mapping(source = "description_company", target = "description_company")
    @Mapping(source = "company_activity", target = "company_activity")
    @Mapping(source = "company_reliability", target = "company_reliability")
    @Mapping(source = "company_link_VK", target = "company_link_VK")
    @Mapping(source = "company_link_website", target = "company_link_website")
    @Mapping(source = "company_status", target = "company_status")
    @Mapping(source = "company_ogrn", target = "company_ogrn")
    @Mapping(source = "company_inn", target = "company_inn")
    @Mapping(source = "company_kpp", target = "company_kpp")
    @Mapping(source = "company_okpo", target = "company_okpo")
    @Mapping(source = "company_legal_address", target = "company_legal_address")
    Company toCompany(CompanyRequestDTO companyRequestDTO);

    @Mapping(source = "name_company", target = "name_company")
    @Mapping(source = "description_company", target = "description_company")
    @Mapping(source = "company_activity", target = "company_activity")
    @Mapping(source = "company_reliability", target = "company_reliability")
    @Mapping(source = "company_link_VK", target = "company_link_VK")
    @Mapping(source = "company_link_website", target = "company_link_website")
    @Mapping(source = "company_status", target = "company_status")
    @Mapping(source = "company_ogrn", target = "company_ogrn")
    @Mapping(source = "company_inn", target = "company_inn")
    @Mapping(source = "company_kpp", target = "company_kpp")
    @Mapping(source = "company_okpo", target = "company_okpo")
    @Mapping(source = "company_legal_address", target = "company_legal_address")
    CompanyResponseDTO toCompanyResponseDTO(Company company);

}
