//package com.example.demo.domain.mission.controller;
//
//import com.example.demo.domain.mission.dto.UserMissionReqDTO;
//import com.example.demo.domain.mission.service.UserMissionServiceImpl;
//import com.example.demo.domain.mission.dto.UserMissionResDTO;
//import com.example.demo.domain.mission.exception.UserMissionSuccessCode;
//import com.example.demo.domain.reveiw.ReveiwDTO;
//import com.example.demo.domain.reveiw.exception.ReveiwSuccessCode;
//import com.example.demo.global.apiPayload.ApiResponse;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequiredArgsConstructor
//public class UserMissionController implements UserMissionControllerDocs{
//
//    private final UserMissionServiceImpl userMissionService;
//
//    @PostMapping("/add-UserMission")
//    public ApiResponse<UserMissionResDTO.JoinDTO> addMission(
//            @RequestBody UserMissionReqDTO.JoinDTO joinDTO
//    ){
//        return ApiResponse.onSuccess(
//                UserMissionSuccessCode.SAVE,
//                userMissionService.saveup(joinDTO)
//        );
//    }
//
//    @GetMapping
//    public ApiResponse<UserMissionResDTO.GetMissionListDTO> getUserMissionById(){
//
//        UserMissionSuccessCode code = UserMissionSuccessCode.FOUND;
//        return ApiResponse.onSuccess(code, userMissionQueryService.findUserMissionnById());
//    }
//
//    @GetMapping
//    public ApiResponse<UserMissionResDTO.GetMissionListDTO> getUserMissionByStatus(){
//
//        UserMissionSuccessCode code = UserMissionSuccessCode.FOUND;
//        return ApiResponse.onSuccess(code, userMissionQueryService.findUserMissionnByStatus());
//    }
//}
