package uz.course_projcet_oliy_mahad.userservice.repository;



import uz.course_projcet_oliy_mahad.userservice.model.entity.UserEntity;
import uz.course_projcet_oliy_mahad.userservice.model.entity.UserRegisterDetails;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<UserRegisterDetails, Long> {
    Optional<UserRegisterDetails> findByUser(UserEntity user);
    Optional<UserRegisterDetails> findByUserId(Long id);

}
