package uz.course_projcet_oliy_mahad.userservice.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GroupSectionDto {

    private Long id;

    private String name ;

    private long membersCount ;

    private String type ;

    private Date startDate ;

    private long courseId ;
}
