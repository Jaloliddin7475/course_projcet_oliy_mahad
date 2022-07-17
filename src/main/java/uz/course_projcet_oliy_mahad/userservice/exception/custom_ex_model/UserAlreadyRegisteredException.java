package uz.course_projcet_oliy_mahad.userservice.exception.custom_ex_model;

public class UserAlreadyRegisteredException extends Exception{
    public UserAlreadyRegisteredException(String message) {
        super(message);
    }
}

