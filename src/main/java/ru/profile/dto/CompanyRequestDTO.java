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
    private String name_company;

    @Size(min = 1, max = 1000, message = "Описание компании должно быть от 1 до 1000 символов")
    private String description_company;

    private Boolean company_activity;

    @Size(min = 16, max = 18, message = "Надежность компании должна быть от 16 до 18 символов")
    @NotBlank(message = "Надежность компании не может быть пустой")
    private String company_reliability;

    @URL(message = "Неверный формат URL")
    private String company_link_VK;

    @URL(message = "Неверный формат URL")
    private String company_link_website;

    @Size(min = 1, max = 100, message = "Статус компании должен быть от 1 до 100 символов")
    @NotBlank(message = "Статус компании не может быть пустым")
    private String company_status;

    @Size(min = 13, max = 13, message = "ОГРН должен состоять из 13 символов")
    @NotBlank(message = "ОГРН не может быть пустым")
    private String company_ogrn;

    @Size(min = 10, max = 12, message = "ИНН должен быть от 10 до 12 символов")
    @NotBlank(message = "ИНН не может быть пустым")
    private String company_inn;

    @Size(min = 9, max = 9, message = "КПП должен состоять из 9 символов")
    @NotBlank(message = "КПП не может быть пустым")
    private String company_kpp;

    @Size(min = 8, max = 10, message = "ОКПО должен быть от 8 до 10 символов")
    @NotBlank(message = "ОКПО не может быть пустым")
    private String company_okpo;

    @Size(min = 1, max = 100, message = "Адрес компании должен быть от 1 до 100 символов")
    @NotBlank(message = "Адрес компании не может быть пустым")
    private String company_legal_address;
}
