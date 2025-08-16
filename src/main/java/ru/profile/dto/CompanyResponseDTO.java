package ru.profile.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyResponseDTO {
    private String name_company;

    private String description_company;

    private Boolean company_activity;

    private String company_reliability;

    private String company_link_VK;

    private String company_link_website;

    private String company_status;

    private String company_ogrn;

    private String company_inn;

    private String company_kpp;

    private String company_okpo;

    private String company_legal_address;
}
