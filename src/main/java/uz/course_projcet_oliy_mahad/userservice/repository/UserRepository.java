package uz.course_projcet_oliy_mahad.userservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.oliymahad.userservice.model.entity.UserEntity;

import java.util.Optional;

@Repository
public interface
UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);

    Optional<UserEntity> findByUsername(String username);

    Optional<UserEntity> findByPhoneNumber(String phoneNumber);

    Page<UserEntity> findByRoles(Integer roleId,Pageable pageable);

    Page<UserEntity> findAllByPhoneNumberContainingIgnoreCaseOrEmailContainingIgnoreCaseOrUsernameContainingIgnoreCase(
            String phoneNumber,
            String email,
            String username,
            Pageable pageable
    );



}
