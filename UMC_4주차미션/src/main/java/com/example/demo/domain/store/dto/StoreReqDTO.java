package com.example.demo.domain.store.dto;

import com.example.demo.domain.user.entity.User;

public class StoreReqDTO {
    public record JoinDTO(
    String name,
    String address,
    String introduce,
    User user
    ){}
}
