package edu.ldcollege.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckFileValidator implements ConstraintValidator<CheckFile,Object> {
    private int size;
    private String[] types;
    @Override
    public void initialize(CheckFile checkFile) {
        size = checkFile.fileMaxSize();
        types = checkFile.fileType();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        if(o == null){
            return true;
        }
        for(String type : types) {

        }
        return false;
    }
}
