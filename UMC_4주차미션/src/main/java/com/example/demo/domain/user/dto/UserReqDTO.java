package com.example.demo.domain.user.dto;

import com.example.demo.domain.user.enums.Gender;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class UserReqDTO {

    public record JoinReqDTO(
            @Schema(description = "사용자 이름", example = "홍길동")
            @NotBlank
            String name,
            @Schema(description = "이메일", example = "test@gwnu.ac.kr")
            @Email
            String email, // 추가된 속성
            @Schema(description = "비번", example = "****")
            @NotBlank
            String password, // 추가된 속성
            @Schema(description = "성별", example = "MALE")
            @NotNull
            Gender gender,
            @Schema(description = "생일", example = "2000-01-01")
            @NotNull
            LocalDate dateBirth,
            @Schema(description = "주소", example = "강원도 원주시 흥업면 남원로")
            @NotBlank
            String address
    ){}
        public record LoginDTO(
                @NotBlank
                String email,
                @NotBlank
                String password
        ){}
}