package uz.course_projcet_oliy_mahad.userservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserSectionResponse {

    private Long id;
    private String name;
    private String username;

}
