package com.example.demo.domain.user.exception;

import com.example.demo.global.apiPayload.BaseErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum UserErrorCode implements BaseErrorCode {
    USER_ALREADY_EXISTS(HttpStatus.BAD_REQUEST, "USER400_1", "이미 존재하는 이메일입니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND,
            "REVIEW404_1",
            "해당 유저를 찾을 수 없습니다."),
    INVALID(HttpStatus.INVALID,
            "REVIEW404_1",
            "유저 인증 실패")
    ;

    private final HttpStatus status;
    private final String code;
    private final String message;
}
