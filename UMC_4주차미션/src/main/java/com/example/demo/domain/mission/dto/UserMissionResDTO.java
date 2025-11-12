package com.example.demo.domain.mission.dto;

import lombok.Builder;

import java.time.LocalDateTime;

public class UserMissionResDTO {
    @Builder
    public record JoinDTO(
            Long reveiwId,
            LocalDateTime startTime
    ){}
}
