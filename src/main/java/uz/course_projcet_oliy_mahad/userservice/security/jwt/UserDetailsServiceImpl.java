package uz.course_projcet_oliy_mahad.userservice.security.jwt;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.oliymahad.userservice.model.entity.UserEntity;
import uz.oliymahad.userservice.repository.UserRepository;


@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  private final UserRepository userRepository;

  @Override
  @Transactional
  public UserEntity loadUserByUsername(String jwtSubj) throws UsernameNotFoundException {

    return jwtSubj.contains("@") ?
            userRepository.findByEmail(jwtSubj).orElseThrow(
                    () -> new UsernameNotFoundException("User not found with - " + jwtSubj)) :
            userRepository.findByPhoneNumber(jwtSubj).orElseThrow(
                    () -> new UsernameNotFoundException("User not found with - " + jwtSubj));
  }

}
