package com.example.demo.domain.reveiw;

import lombok.Builder;

import java.util.List;

public class ReveiwDTO {

    @Builder
    public record Reveiwing(
            String reveiwing
    ) {}

    public record ReveiwSaveReqDTO(
            Long userId,
            Long storeId,
            Long userMissionId,
            String title,
            String description,
            String image,
            int scope
    ) {}

    @Builder
    public record ReveiwSaveResDTO(
            Long id
    ) {}

    @Builder
    public record ReveiwViewDTO(
            Long userId,
            Long storeId,
            Long userMissionId,
            String title,
            String description,
            String image,
            int scope
    ){}

    @Builder
    public record ReveiwViewMissionDTO(
            List<ReveiwViewDTO> reveiwViewDTOList,
            Integer listSize,
            Integer totalSize,
            Long totalElements,
            Boolean isFirst,
            Boolean isLast
    ){}
}
