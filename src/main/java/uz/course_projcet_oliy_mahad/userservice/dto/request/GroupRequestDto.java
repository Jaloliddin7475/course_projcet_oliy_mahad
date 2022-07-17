package uz.course_projcet_oliy_mahad.userservice.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class GroupRequestDto {

    private String name ;

    private long membersCount ;

    private String type ;

    private Date startDate ;

    private long courseId ;


}
