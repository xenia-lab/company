package ru.profile.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "company", schema = "public")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_company")
    private Long id;

    @Column(name = "name_company")
    private String nameCompany;

    @Column(name = "description_company")
    private String descriptionCompany;

    @Column(name = "company_activity")
    private Boolean companyActivity;

    @Column(name = "company_reliability")
    private Reliability companyReliability;

    @Column(name = "company_link_VK")
    private String companyLinkVK;

    @Column(name = "company_link_website")
    private String companyLinkWebsite;

    @Column(name = "company_status")
    private Status companyStatus;

    @Column(name = "company_ogrn")
    private String companyOgrn;

    @Column(name = "company_inn")
    private String companyInn;

    @Column(name = "company_kpp")
    private String companyKpp;

    @Column(name = "company_okpo")
    private String companyOkpo;

    @Column(name = "company_legal_address")
    private String companyLegalAddress;

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Products> products = new ArrayList<>();

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Person> person = new ArrayList<>();
}
