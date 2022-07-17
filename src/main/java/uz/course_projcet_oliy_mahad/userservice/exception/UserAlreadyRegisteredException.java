package uz.course_projcet_oliy_mahad.userservice.exception;

public class UserAlreadyRegisteredException extends RuntimeException{
    public UserAlreadyRegisteredException(String message) {
        super(message);
    }
}

