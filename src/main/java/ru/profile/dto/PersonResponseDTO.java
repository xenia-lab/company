package ru.profile.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonResponseDTO {
    private String personName;

    private String personLastname;

    private String personPatronymic;

    private String personWorkDirection;

    private String personPhone;
}
