package com.example.demo.domain.mission.exception;

import com.example.demo.global.apiPayload.BaseSuccessCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum UserMissionSuccessCode implements BaseSuccessCode {
    SAVE(HttpStatus.OK, "USERMISSION200_1","성공적으로 유저미션을 저장했습니다");
    private HttpStatus httpStatus;
    private String code;
    private String message;
}
