package ru.profile.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonRequestDTO {
    private String person_name;

    private String person_lastname;

    private String person_patronymic;

    private String person_work_direction;

    private String person_phone;
}
