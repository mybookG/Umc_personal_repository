package com.example.demo.domain.store.dto;

import lombok.Builder;

public class StoreResDTO {
    @Builder
    public record JoinDTO(
            Long id
    ){}
}
