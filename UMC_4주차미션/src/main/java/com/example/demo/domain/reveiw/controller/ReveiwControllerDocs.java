package com.example.demo.domain.reveiw.controller;

import com.example.demo.domain.reveiw.ReveiwDTO;
import com.example.demo.domain.reveiw.exception.ReveiwSuccessCode;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;

public interface ReveiwControllerDocs {
    @Operation(
            summary = "가게의 리뷰 목록 조회 API",
            description = "특정 가게의 리뷰를 모두 조회합니다. "
    )
    @ApiResponses({
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "201", description = "성공"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "401", description = "실패")
    })
    @GetMapping("/reviews")
    public ApiResponse<ReveiwDTO.ReveiwViewMissionDTO> getReviews(){

        ReveiwSuccessCode code = ReveiwSuccessCode.FOUND;
        return ApiResponse.onSuccess(code, null);
    }
}
