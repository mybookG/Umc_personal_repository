package com.example.demo.domain.user.exception;

import com.example.demo.global.apiPayload.BaseErrorCode;
import com.example.demo.global.apiPayload.GeneralErrorCode;

public class UserException extends RuntimeException {

    // 💡 에러 코드를 저장할 필드 추가
    private BaseErrorCode code;

    // 💡 생성자: BaseErrorCode를 받아 RuntimeException의 메시지와 함께 저장합니다.
    public UserException(BaseErrorCode code) {
        super(code.getMessage()); // RuntimeException의 메시지로 BaseErrorCode의 메시지를 사용
        this.code = code;
    }

    // 💡 getter 추가 (이 코드가 GeneralErrorCode의 역할을 대체)
    public BaseErrorCode getCode() {
        return code;
    }
}
