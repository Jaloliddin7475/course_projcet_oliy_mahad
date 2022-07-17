package uz.course_projcet_oliy_mahad.userservice.exception.custom_ex_model;

public class UserNotFoundException extends UserAuthenticationException{

    public UserNotFoundException(String message) {
        super(message);
    }
}
