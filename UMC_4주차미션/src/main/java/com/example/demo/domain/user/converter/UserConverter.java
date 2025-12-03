package com.example.demo.domain.user.converter;

import com.example.demo.domain.user.dto.UserReqDTO;
import com.example.demo.domain.user.dto.UserResDTO;
import com.example.demo.domain.user.entity.User;
import com.example.demo.domain.user.enums.Role;

import java.time.LocalDateTime;

public class UserConverter {
    public static User toMember(
            UserReqDTO.JoinReqDTO dto,
            String password,
            Role role
    ){
        LocalDateTime now = LocalDateTime.now();

        return User.builder()
                .name(dto.name())
                .email(dto.email())
                .password(password)
                .role(role)
                .dateBirth(dto.dateBirth())
                .address(dto.address())
                .gender(dto.gender())
                .point(0L) // 기본 포인트 0으로 설정
                .createdAt(now)
                .updatedAt(now)
                .build();
    }
    public static UserResDTO.JoinResDTO toJoinResDTO(User user) {
        return new UserResDTO.JoinResDTO(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getGender(),
                user.getDateBirth(),
                user.getAddress(),
                user.getCreatedAt(),
                user.getPoint(),
                user.getRole()
        );
    }
}
