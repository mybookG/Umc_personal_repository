package com.example.demo.domain.user.service;

import com.example.demo.domain.user.converter.CustomUserDetails;
import com.example.demo.domain.user.dto.UserReqDTO;
import com.example.demo.domain.user.dto.UserResDTO;
import com.example.demo.domain.user.entity.User;
import com.example.demo.domain.user.exception.UserErrorCode;
import com.example.demo.domain.user.exception.UserException;
import com.example.demo.domain.user.repository.UserRepository;
import com.example.demo.global.JwtUtil;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserQueryServiceImpl implements UserQueryService{

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder encoder;

    @Override
    public UserResDTO.LoginDTO login(
            UserReqDTO.@Valid LoginDTO dto
    ) {

        // User 조회
        User user = UserRepository.findByEmail(dto.email())
                .orElseThrow(() -> new UserException(UserErrorCode.NOT_FOUND));

        // 비밀번호 검증
        if (!encoder.matches(dto.password(), user.getPassword())){
            throw new UserException(UserErrorCode.INVALID);
        }

        // JWT 토큰 발급용 UserDetails
        CustomUserDetails userDetails = new CustomUserDetails(user);

        // 엑세스 토큰 발급
        String accessToken = jwtUtil.createAccessToken(userDetails);

        // DTO 조립
        return UserConverter.toLoginDTO(user, accessToken);
    }
}
