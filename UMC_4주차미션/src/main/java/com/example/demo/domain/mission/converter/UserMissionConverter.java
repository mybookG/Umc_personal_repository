package com.example.demo.domain.mission.converter;

import com.example.demo.domain.mission.dto.UserMissionReqDTO;
import com.example.demo.domain.mission.dto.UserMissionResDTO;
import com.example.demo.domain.mission.entity.UserMission;

public class UserMissionConverter {
    public static UserMissionResDTO.JoinDTO toJoinDTO(UserMission userMission) {
        return UserMissionResDTO.JoinDTO.builder()
                .reveiwId(userMission.getId())
                .startTime(userMission.getStartTime())
                .build();
    }

    public static UserMission toUserMission(
            UserMissionReqDTO.JoinDTO userMissionReqDTO
    ){
        return UserMission.builder()
                .status(userMissionReqDTO.status())
                .user(userMissionReqDTO.user())
                .mission(userMissionReqDTO.mission())
                .build();
    }
}
