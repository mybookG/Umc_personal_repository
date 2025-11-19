package com.example.demo.domain.mission.service;

import com.example.demo.domain.mission.converter.UserMissionConverter;
import com.example.demo.domain.mission.dto.UserMissionResDTO;
import com.example.demo.domain.mission.entity.UserMission;
import com.example.demo.domain.mission.enums.Status;
import com.example.demo.domain.reveiw.ReveiwDTO;
import com.example.demo.domain.reveiw.converter.ReveiwConverter;
import com.example.demo.domain.reveiw.entity.Reveiw;
import com.example.demo.domain.reveiw.service.ReveiwQueryService;
import com.example.demo.domain.store.entity.Store;
import com.example.demo.domain.user.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import static com.example.demo.domain.user.entity.QUser.user;

public class UserMissionQueryServiceImpl implements UserMissionQueryService {

    @Override
    public UserMissionResDTO.UsertMissionVeiwDTO findUserMissionById() {
        public UserMissionResDTO.UsertMissionVeiwDTO userMissionDto(UserMissionResDTO.GetMissionListDTO req) {

            User user = userRepository.findById(req.userId())
                    .orElseThrow(() -> new IllegalArgumentException("User not found"));

            UserMission mission = userMissionRepository.findById(req.userMissionId())
                    .orElseThrow(() -> new IllegalArgumentException("UserMission not found"));

        }
        PageRequest pageRequest = PageRequest.of(1, 10);
        Page<UserMission>  userMissions= userMissionDto.findAll(user ,pageRequest);

        return UserMissionConverter.toUserMissionPreviewListDTO(userMissions);
    }
    @Override
    public UserMissionResDTO.UsertMissionVeiwDTO findeUserMissionByStatus() {
        public UserMissionResDTO.UsertMissionVeiwDTO userMissionDto(UserMissionResDTO.GetMissionListDTO req) {


            User user = userRepository.findById(req.userId())
                    .orElseThrow(() -> new IllegalArgumentException("User not found"));

            UserMission mission = userMissionRepository.findById(req.userMissionId())
                    .orElseThrow(() -> new IllegalArgumentException("UserMission not found"));
            Status targetStatus = Status.CHALLENGING; // 예: 도전 중인 미션만 조회
            PageRequest pageRequest = PageRequest.of(1, 10);
            Page<UserMission> userMissions = userMissionRepository.findAllByUserAndStatus(user, targetStatus, pageRequest);

            return UserMissionConverter.toUserMissionPreviewListDTO(userMissions);

        }


    }
}
