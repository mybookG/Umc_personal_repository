package com.example.demo.domain.mission.dto;

import com.example.demo.domain.mission.entity.Mission;
import com.example.demo.domain.mission.entity.UserMission;
import com.example.demo.domain.mission.enums.Status;
import com.example.demo.domain.reveiw.ReveiwDTO;
import com.example.demo.domain.user.entity.User;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

public class UserMissionResDTO {
    @Builder
    public record JoinDTO(
            Long reveiwId,
            LocalDateTime startTime
    ){}

    @Builder
    public record GetMissionListDTO(
            UserMission<UsertMissionVeiwDTO> UserMissionViewDTOList,
            Integer listSize,
            Integer totalSize,
            Long totalElements,
            Boolean isFirst,
            Boolean isLast
    ){}

    @Builder
    public record UsertMissionVeiwDTO(
            Status status,
            Mission mission,
            User user
    ){}
}
