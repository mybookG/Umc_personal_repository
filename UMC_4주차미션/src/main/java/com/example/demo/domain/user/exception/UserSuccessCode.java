package com.example.demo.domain.user.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum UserSuccessCode {
    ACCEPTED(HttpStatus.ACCEPTED,
            "USERS202_1",
            "유저 로그인 성공"
    ),
    FOUND(HttpStatus.FOUND,
            "REVIEW201_1",
            "dbwh 조회 성공적"),
    ;

    private final HttpStatus status;
    private final String code;
    private final String message;
}
