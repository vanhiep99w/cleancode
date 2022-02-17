package com.clean.code.handle;

import com.clean.code.model.InputConact;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        try {
            List<InputConact> inputConactList = Utils.handleInputFile();

            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

            Validator validator = factory.getValidator();

            for(InputConact conact: inputConactList){

                // set cac error
                Set<ConstraintViolation<InputConact>> constraintViolations =
                        validator.validate( conact );

                if(constraintViolations.size() == 0) {

                    // set cac error bang 0 thi object valid
                    System.out.println(conact.getId());
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
