package ru.profile.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.profile.dto.ErrorResponseDTO;

import java.time.LocalDateTime;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    ErrorResponseDTO InternalServerHandler(EntityNotFoundException ex) {
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
        errorResponseDTO.setMessage(ex.getMessage());
        errorResponseDTO.setTimestamp(LocalDateTime.now());
        errorResponseDTO.setError(ex.getClass().getName());
        errorResponseDTO.setHttpStatus(HttpStatus.NOT_FOUND);
        return errorResponseDTO;
    }

    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ErrorResponseDTO handleValidationException (MethodArgumentNotValidException ex) {
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
        errorResponseDTO.setMessage(ex.getFieldError().getDefaultMessage());
        errorResponseDTO.setTimestamp(LocalDateTime.now());
        errorResponseDTO.setError(ex.getClass().getName());
        errorResponseDTO.setHttpStatus(HttpStatus.BAD_REQUEST);
        return errorResponseDTO;
    }
}
