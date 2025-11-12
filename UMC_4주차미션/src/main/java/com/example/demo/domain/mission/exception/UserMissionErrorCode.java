package com.example.demo.domain.mission.exception;

import com.example.demo.global.apiPayload.BaseSuccessCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum UserMissionErrorCode implements BaseSuccessCode {
    NOT_SAVE(HttpStatus.INTERNAL_SERVER_ERROR,"USERMISSION404_1","유저미션을 저장을 실패했습니다");
    private HttpStatus httpStatus;
    private String code;
    private String message;
}
