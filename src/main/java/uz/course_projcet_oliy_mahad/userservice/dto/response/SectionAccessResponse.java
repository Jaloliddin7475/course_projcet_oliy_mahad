package uz.course_projcet_oliy_mahad.userservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class SectionAccessResponse {
    private long id;
    private String sectionName;

}
