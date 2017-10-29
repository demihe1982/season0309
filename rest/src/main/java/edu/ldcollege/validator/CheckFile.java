package edu.ldcollege.validator;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Constraint(validatedBy = CheckFileValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckFile {
    int fileMaxSize();
    String[] fileType();
}
