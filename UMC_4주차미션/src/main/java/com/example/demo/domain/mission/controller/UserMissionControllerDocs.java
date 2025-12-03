//package com.example.demo.domain.mission.controller;
//
//import com.example.demo.domain.mission.dto.UserMissionResDTO;
//import com.example.demo.domain.mission.exception.UserMissionSuccessCode;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
//import org.springframework.web.bind.annotation.GetMapping;
//
//public interface UserMissionControllerDocs {
//    @Operation(
//            summary = "가게의 리뷰 목록 조회 API",
//            description = "특정 가게의 리뷰를 모두 조회합니다. "
//    )
//    @ApiResponses({
//            @ApiResponse(responseCode = "201", description = "성공"),
//            @ApiResponse(responseCode = "401", description = "실패")
//    })
//    @GetMapping("/userMission")
//    public ApiResponse<UserMissionResDTO.UsertMissionVeiwDTO> getUserMissionById() {
//
//        UserMissionSuccessCode code = UserMissionSuccessCode.FOUND;
//        return ApiResponse.onSuccess(code, null);
//    }
//
//    @GetMapping
//    public ApiResponse<UserMissionResDTO.UsertMissionVeiwDTO> getUserMissionByStatus() {
//
//        UserMissionSuccessCode code = UserMissionSuccessCode.FOUND;
//        return ApiResponse.onSuccess(code, null);
//    }
//}
