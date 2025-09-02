package ru.profile.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonRequestDTO {

    @Size(min = 1, max = 100, message = "Имя должно быть от 1 до 100 символов!")
    @NotBlank(message = "Имя не может быть пустым!")
    private String personName;

    @Size(min = 1, max = 100, message = "Фамилия должна быть от 1 до 100 символов!")
    @NotBlank(message = "Фамилия не может быть пустой!")
    private String personLastname;

    @Size(min = 1, max = 100, message = "Отчество должно быть от 1 до 100 символов")
    private String personPatronymic;

    @Size(min = 1, max = 100, message = "Направление работы должно быть от 1 до 100 символов")
    @NotBlank(message = "Направление работы не может быть пустым")
    private String personWorkDirection;

    @Pattern(regexp = "^\\+?[0-9. ()-]{10,25}$", message = "Неверный формат телефона")
    @NotBlank(message = "Телефон не может быть пустым")
    private String personPhone;

    private Long companyId;
}
