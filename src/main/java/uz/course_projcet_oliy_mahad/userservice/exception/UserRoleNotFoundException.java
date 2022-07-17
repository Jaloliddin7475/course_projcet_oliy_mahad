package uz.course_projcet_oliy_mahad.userservice.exception;

public class UserRoleNotFoundException extends RuntimeException{
    public UserRoleNotFoundException(String message) {
        super(message);
    }
}
