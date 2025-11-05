package com.example.demo.global.apiPayload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import com.example.demo.global.apiPayload.BaseSuccessCode;

@Getter
@AllArgsConstructor
public enum GeneralSuccessCode implements BaseSuccessCode{
    OK(
            HttpStatus.OK,
            "COMMON200_1",
            "요청이 성공적으로 처리되었습니다"),
    CREATED(
            HttpStatus.CREATED,
            "COMMON201_1",
            "리소스가 생성되었습니다"
    ),
    ACCEPTED(
            HttpStatus.ACCEPTED,
            "COMMON202_1",
            "요청이 들어갔습니다"
    );

    private final HttpStatus httpStatus;
    private final String Code;
    private final String message;
}
