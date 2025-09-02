package ru.profile.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyResponseDTO {
    private String nameCompany;

    private String descriptionCompany;

    private Boolean companyActivity;

    private String companyReliability;

    private String companyLinkVK;

    private String companyLinkWebsite;

    private String companyStatus;

    private String companyOgrn;

    private String companyInn;

    private String companyKpp;

    private String companyOkpo;

    private String companyLegalAddress;
}
