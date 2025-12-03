package com.example.demo.domain.user.dto;

import com.example.demo.domain.user.enums.Gender;
import com.example.demo.domain.user.enums.Role;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class UserResDTO {
    @Builder
    public record JoinResDTO(
            @Schema(description = "사용자 ID", example = "1")
            Long id,
            @Schema(description = "사용자 이름", example = "홍길동")
            String name,
            @Schema(description = "이메일", example = "test@gwnu.ac.kr")
            String email,
            Gender gender,
            LocalDate dateBirth,
            String address,
            @Schema(description = "가입 시각")
            LocalDateTime createdAt,
            @Schema(description = "포인트", example = "1000")
            Long point,
            @Schema(description = "사용자 권한", example = "ROLE_USER")
            Role role
    ){}

    @Builder
    public record LoginDTO(
            Long memberId,
            String accessToken
    ){}
}
