package uz.course_projcet_oliy_mahad.userservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateRequest {
    private String phoneNumber;

    private String email;

    private String password;

    private ImageRequest image;
}
