package uz.course_projcet_oliy_mahad.userservice.annotation.phone_num_constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {PhoneNumberValidator.class})
public @interface PhoneNumber {
    public String message() default "Invalid phone number format";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
