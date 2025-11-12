package com.example.demo.domain.reveiw.converter;

import com.example.demo.domain.reveiw.ReveiwDTO;
import com.example.demo.domain.reveiw.entity.Reveiw;

public class ReveiwConverter {

    // DTO → Entity 변환
    public static Reveiw toEntity(ReveiwDTO.Reveiwing reveiwDTO) {
        return Reveiw.builder()
                .description(reveiwDTO.getReveiwing()) // reveiwing → description
                .build();
    }

    // Entity → DTO 변환
    public static ReveiwDTO.Reveiwing toReveiwing(Reveiw reveiw) {
        return ReveiwDTO.Reveiwing.builder()
                .reveiwing(reveiw.getDescription()) // description → reveiwing
                .build();
    }

    public static  ReveiwDTO.ReveiwSaveResDTO toJoinDTO(Reveiw reveiw) {
        return ReveiwDTO.ReveiwSaveResDTO.builder()
                .id(reveiw.getId())
                .build();
    }

    public static Reveiw toReveiw(ReveiwDTO.ReveiwSaveReqDTO reveiwDTO) {
        return Reveiw.builder()
                .title(reveiwDTO.title())
                .description(reveiwDTO.description())
                .image(reveiwDTO.image())
                .user(reveiwDTO.user())
                .scope(reveiwDTO.scope())
                .store(reveiwDTO.store())
                .userMission(reveiwDTO.userMission())
                .build();
    }
}
