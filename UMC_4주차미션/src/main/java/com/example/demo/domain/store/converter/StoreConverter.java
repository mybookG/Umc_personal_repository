package com.example.demo.domain.store.converter;

import com.example.demo.domain.store.dto.StoreReqDTO;
import com.example.demo.domain.store.dto.StoreResDTO;
import com.example.demo.domain.store.entity.Store;

public class StoreConverter {
    public static StoreResDTO.JoinDTO toDTO(Store store) {
        return StoreResDTO.JoinDTO.builder().id(store.getId()).build();
    }
    public static Store toEntity(StoreReqDTO.JoinDTO dto) {
        return Store.builder()
                .name(dto.name())
                .address(dto.address())
                .introduce(dto.introduce())
                .user(dto.user())
                .build();
    }
}
