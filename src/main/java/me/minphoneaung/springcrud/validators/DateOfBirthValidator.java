package me.minphoneaung.springcrud.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import me.minphoneaung.springcrud.annotations.ValidateDateOfBirth;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateOfBirthValidator implements ConstraintValidator<ValidateDateOfBirth, LocalDate> {

    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    @Override
    public void initialize(ValidateDateOfBirth constraintAnnotation) {
    }

    @Override
    public boolean isValid(LocalDate dateOfBirth, ConstraintValidatorContext context) {
        return dateOfBirth != null && !dateOfBirth.isAfter(LocalDate.now());
    }
}
