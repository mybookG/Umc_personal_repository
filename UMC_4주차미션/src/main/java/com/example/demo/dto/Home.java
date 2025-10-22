package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Home {
    private long userId;
    private String title;
    private int missionPoint;
    private String storeName;
    private String storeAddress;
    private long userPoint;
}
