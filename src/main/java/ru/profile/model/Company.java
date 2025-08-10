package ru.profile.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    private String name_company;

    @Column(name = "description_company")
    private String description_company;

    @Column(name = "company_activity")
    private Boolean company_activity;

    @Column(name = "company_reliability")
    private String company_reliability;

    @Column(name = "company_link_VK")
    private String company_link_VK;

    @Column(name = "company_link_website")
    private String company_link_website;

    @Column(name = "company_status")
    private String company_status;

    @Column(name = "company_ogrn")
    private String company_ogrn;

    @Column(name = "company_inn")
    private String company_inn;

    @Column(name = "company_kpp")
    private String company_kpp;

    @Column(name = "company_okpo")
    private String company_okpo;

    @Column(name = "company_legal_address")
    private String company_legal_address;

}
