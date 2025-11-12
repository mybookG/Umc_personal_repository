package com.example.demo.domain.mission.controller;

import com.example.demo.domain.mission.service;
import com.example.demo.domain.mission.dto.UserMissionResDTO;
import com.example.demo.domain.mission.exception.UserMissionSuccessCode;
import com.example.demo.global.apiPayload.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserMissionController {

    @PostMapping("/add-UserMission")
    public ApiResponse<UserMissionResDTO.JoinDTO> addMission(
            @RequestBody UserMissionResDTO.JoinDTO joinDTO
    ){
        return ApiResponse.onSuccess(UserMissionSuccessCode.SAVE, UserMissionCommandService.saveup(joinDTO));
    }
}
