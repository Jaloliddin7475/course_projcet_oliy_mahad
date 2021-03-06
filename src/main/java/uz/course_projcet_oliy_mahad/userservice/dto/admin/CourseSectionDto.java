package uz.course_projcet_oliy_mahad.userservice.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CourseSectionDto {
    private Long id;
    private String name;
    private String description;
    private double price;
    private float duration;
}
