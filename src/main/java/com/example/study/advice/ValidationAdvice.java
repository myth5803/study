package com.example.study.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ValidationAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> hanle(MethodArgumentNotValidException exception) {
        BindingResult bindingResult = exception.getBindingResult();

        FieldError fieldError = bindingResult.getFieldError();

        StringBuilder builder = new StringBuilder(fieldError.getDefaultMessage());

        if ("Size".equals(fieldError.getCode())) {
            Object[] arguments = fieldError.getArguments();
            int min = (int) arguments[1];
            int max = (int) arguments[2];

            if(min == max) {
                builder.append("(").append("length:").append(min).append(")");
            } else {
                builder.append("(").append("min:").append(min).append(", max:").append(max).append(")");
            }
        }

        return ResponseEntity.badRequest().body(builder.toString());
    }

}
