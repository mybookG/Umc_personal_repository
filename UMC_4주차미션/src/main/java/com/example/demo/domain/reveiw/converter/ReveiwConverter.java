package com.example.demo.domain.reveiw.converter;

import com.example.demo.domain.reveiw.ReveiwDTO;

public class ReveiwConverter {
    public static ReveiwDTO.Reveiwing toReveiwing(ReveiwDTO.Reveiwing reveiwDTO) {
        return ReveiwDTO.Reveiwing.builder()
                .reveiwing(reveiwDTO.getReveiwing()) // getter 사용
                .build();
    }
}
