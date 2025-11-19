package com.example.demo.domain.mission.converter;

import com.example.demo.domain.mission.dto.UserMissionReqDTO;
import com.example.demo.domain.mission.dto.UserMissionResDTO;
import com.example.demo.domain.mission.entity.UserMission;
import com.example.demo.domain.reveiw.ReveiwDTO;
import com.example.demo.domain.reveiw.entity.Reveiw;
import org.hibernate.query.Page;

import static com.example.demo.domain.user.entity.QUser.user;

public class UserMissionConverter {
    public static UserMissionResDTO.JoinDTO toJoinDTO(UserMission userMission) {
        return UserMissionResDTO.JoinDTO.builder()
                .reveiwId(userMission.getId())
                .startTime(userMission.getStartTime())
                .build();
    }

    public static UserMission toUserMission(
            UserMissionReqDTO.JoinDTO userMissionReqDTO
    ){
        return UserMission.builder()
                .status(userMissionReqDTO.status())
                .user(userMissionReqDTO.user())
                .mission(userMissionReqDTO.mission())
                .build();
    }
    public static UserMissionResDTO.GetMissionListDTO toUserMissionPreviewListDTO(
            Page<UserMission> result
    ){
        return UserMissionResDTO.GetMissionListDTO.builder()
                .UserMissionViewDTOList(result.getContent().stream()
                        .map(UserMissionConverter::toReviewPreviewDTO)
                        .toList()
                )
                .listSize(result.getSize())
                .totalPage(result.getTotalPages())
                .totalElements(result.getTotalElements())
                .isFirst(result.isFirst())
                .isLast(result.isLast())
                .build();
    }

    public static UserMissionResDTO.UsertMissionVeiwDTO usertMissionVeiwDTO(
            UserMission userMission
    ){
        return UserMissionResDTO.UsertMissionVeiwDTO.builder()
                .status(userMission.getStatus())
                .mission(userMission.getMission())
                .user(user.getId())
                .build();
    }
}
