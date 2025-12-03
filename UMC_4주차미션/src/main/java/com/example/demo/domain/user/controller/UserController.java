package com.example.demo.domain.user.controller;
import com.example.demo.domain.user.dto.UserReqDTO;
import com.example.demo.domain.user.dto.UserResDTO;
import com.example.demo.domain.user.exception.UserSuccessCode;
import com.example.demo.domain.user.service.UserCommandServiceImpl;
import com.example.demo.domain.user.service.UserQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // 컨트롤러임을 선언하고 @ResponseBody를 포함
@RequiredArgsConstructor // final 필드(@Service 등)를 자동 주입
@RequestMapping("/api/users") // 해당 컨트롤러의 기본 URL 경로 설정
public class UserController {

    // 이전에 구현한 UserCommandServiceImpl을 주입받습니다.
    private final UserCommandServiceImpl userCommandService;

    /**
     * [POST] /api/users/signup
     * 새로운 회원을 등록하는 회원가입 API
     */
    @Operation(summary = "회원가입", description = "새로운 사용자 계정을 생성합니다.")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "회원가입 성공",
                    content = @Content(schema = @Schema(implementation = UserResDTO.JoinResDTO.class))),
            @ApiResponse(responseCode = "400", description = "요청 본문 유효성 검사 실패")
            // ... (필요한 다른 응답 코드 추가)
    })
    @PostMapping("/sign-up")
    public ResponseEntity<UserResDTO.JoinResDTO> signup(
            // @RequestBody: JSON 요청 본문을 DTO 객체로 변환합니다.
            // @Valid: DTO에 설정된 유효성 검사(NotBlank, Email 등)를 수행합니다.
            @RequestBody @Valid UserReqDTO.JoinReqDTO dto
    ) {
        // 1. 서비스 레이어의 회원가입 로직 호출
        UserResDTO.JoinResDTO result = userCommandService.signup(dto);

        // 2. HTTP 201 Created 상태 코드와 함께 응답 DTO를 본문에 담아 반환
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PostMapping("/login")
    public ApiResponse<UserResDTO.LoginDTO> login(
            @RequestBody @Valid UserReqDTO.LoginDTO dto
    ){
        return ApiResponse.onSuccess(UserSuccessCode.ACCEPTED, UserQueryService.login(dto));
    }
}