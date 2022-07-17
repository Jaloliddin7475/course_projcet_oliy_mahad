package uz.course_projcet_oliy_mahad.userservice.dto.response.admin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSectionDto {
    private Long id;
    private String name;
    private String username;
    private String phoneNumber;

}
