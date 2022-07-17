package uz.course_projcet_oliy_mahad.userservice.exception.custom_ex_model;

public class UserRoleNotFoundException extends RuntimeException{
    public UserRoleNotFoundException(String message) {
        super(message);
    }
}
