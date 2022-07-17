package uz.course_projcet_oliy_mahad.userservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SectionPermissionDto {
    private boolean visibility;
    private boolean update;
    private boolean delete;
    private boolean info;
}
