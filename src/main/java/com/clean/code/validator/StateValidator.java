package com.clean.code.validator;

import com.clean.code.constant.Constans;
import com.clean.code.validator.annotation.State;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StateValidator implements ConstraintValidator<State, String> {


    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        if("".equals(s)){
            return false;
        }

        return Constans.VALID_ZIP_CODES.contains(s);
    }

}
