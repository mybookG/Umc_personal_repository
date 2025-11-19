package com.example.demo.domain.mission.dto;

import com.example.demo.domain.mission.entity.Mission;
import com.example.demo.domain.mission.enums.Status;
import com.example.demo.domain.reveiw.entity.Reveiw;
import com.example.demo.domain.user.entity.User;

public class UserMissionReqDTO {
    public record  JoinDTO(
            Status status,
            User user,
            Mission mission
    ){}
}
