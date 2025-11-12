package com.example.demo.domain.reveiw;

import com.example.demo.domain.mission.entity.UserMission;
import com.example.demo.domain.store.entity.Store;
import com.example.demo.domain.user.entity.User;
import lombok.Builder;

public class ReveiwDTO {
    @Builder
    public record Reveiwing (
        String reveiwing
    ){}

    public record ReveiwSaveReqDTO(
        String title,
        String description,
        String image,
        int scope,
        User user,
        Store store,
        UserMission userMission
    ){}

    @Builder
    public record ReveiwSaveResDTO(
            Long id
    ){}
}
