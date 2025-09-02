package ru.profile.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

@Getter
@Setter
public class CompanyRequestDTO {

    @Size(min = 1, max = 100, message = "Название компании должно быть от 1 до 100 символов")
    @NotBlank(message = "Название компании не может быть пустым")
    private String nameCompany;

    @Size(min = 1, max = 1000, message = "Описание компании должно быть от 1 до 1000 символов")
    private String descriptionCompany;

    private Boolean companyActivity;


    @NotBlank(message = "Надежность компании не может быть пустой")
    private String companyReliability;

    @URL(message = "Неверный формат URL")
    private String companyLinkVK;

    @URL(message = "Неверный формат URL")
    private String companyLinkWebsite;

    @Size(min = 1, max = 100, message = "Статус компании должен быть от 1 до 100 символов")
    @NotBlank(message = "Статус компании не может быть пустым")
    private String companyStatus;

    @Size(min = 13, max = 13, message = "ОГРН должен состоять из 13 символов")
    @NotBlank(message = "ОГРН не может быть пустым")
    private String companyOgrn;

    @Size(min = 10, max = 12, message = "ИНН должен быть от 10 до 12 символов")
    @NotBlank(message = "ИНН не может быть пустым")
    private String companyInn;

    @Size(min = 9, max = 9, message = "КПП должен состоять из 9 символов")
    @NotBlank(message = "КПП не может быть пустым")
    private String companyKpp;

    @Size(min = 8, max = 10, message = "ОКПО должен быть от 8 до 10 символов")
    @NotBlank(message = "ОКПО не может быть пустым")
    private String companyOkpo;

    @Size(min = 1, max = 100, message = "Адрес компании должен быть от 1 до 100 символов")
    @NotBlank(message = "Адрес компании не может быть пустым")
    private String companyLegalAddress;
}
