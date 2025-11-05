package com.example.demo.domain.reveiw;

import lombok.Builder;
import lombok.Getter;

public class ReveiwDTO {
    @Builder
    @Getter
    public static class Reveiwing {
        private String reveiwing;
    }
}
