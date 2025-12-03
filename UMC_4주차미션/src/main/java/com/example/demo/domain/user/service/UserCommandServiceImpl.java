package com.example.demo.domain.user.service;

import com.example.demo.domain.user.converter.UserConverter;
import com.example.demo.domain.user.dto.UserReqDTO;
import com.example.demo.domain.user.dto.UserResDTO;
import com.example.demo.domain.user.entity.User;
import com.example.demo.domain.user.enums.Role;
import com.example.demo.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserCommandServiceImpl {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    // 회원가입
    public UserResDTO.JoinResDTO signup(
            UserReqDTO.JoinReqDTO dto
    ) {

        // 솔트된 비밀번호 생성
        String salt = passwordEncoder.encode(dto.password());

        // 사용자 생성: 유저 / 관리자는 따로 API 만들어서 관리
        User user = UserConverter.toMember(dto, salt, Role.ROLE_USER);

        User saveUser = userRepository.save(user);

        return UserConverter.toJoinResDTO(saveUser);
    }

}
