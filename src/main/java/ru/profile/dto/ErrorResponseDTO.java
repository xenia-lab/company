package ru.profile.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponseDTO {

    private String message;

    private String error;

    private LocalDateTime timestamp;

    private HttpStatus httpStatus;

}
