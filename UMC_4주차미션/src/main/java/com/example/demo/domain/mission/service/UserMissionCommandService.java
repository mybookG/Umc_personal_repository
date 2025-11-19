package com.example.demo.domain.mission.service;

import com.example.demo.domain.mission.dto.UserMissionReqDTO;
import com.example.demo.domain.mission.dto.UserMissionResDTO;

public interface UserMissionCommandService {
    UserMissionResDTO.JoinDTO saveup(UserMissionReqDTO.JoinDTO joinDTO);
}
