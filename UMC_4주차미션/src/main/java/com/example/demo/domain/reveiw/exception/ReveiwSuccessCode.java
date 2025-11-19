package com.example.demo.domain.reveiw.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ReveiwSuccessCode {

    FOUND(HttpStatus.FOUND,
            "REVIEW201_1",
            "리뷰 조회 성공적"),
    ;

    private final HttpStatus status;
    private final String code;
    private final String message;
}
