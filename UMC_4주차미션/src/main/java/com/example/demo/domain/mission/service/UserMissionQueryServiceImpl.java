//package com.example.demo.domain.mission.service;
//
//import org.springframework.data.domain.Page;
//import com.example.demo.domain.mission.converter.UserMissionConverter;
//import com.example.demo.domain.mission.dto.UserMissionResDTO;
//import com.example.demo.domain.mission.entity.UserMission;
//import com.example.demo.domain.mission.enums.Status;
//import com.example.demo.domain.user.entity.User;
//import org.springframework.data.domain.PageRequest;
//
//public class UserMissionQueryServiceImpl implements UserMissionQueryService {
//
//    @Override
//    public UserMissionResDTO.UsertMissionVeiwDTO findUserMissionById(UserMissionResDTO.UsertMissionVeiwDTO req) {
//
//        User user = UserRepository.findById(req.userId())
//                .orElseThrow(() -> new IllegalArgumentException("User not found"));
//
//        UserMission mission = UserMissionRepository.findById(req.userMissionId())
//                .orElseThrow(() -> new IllegalArgumentException("UserMission not found"));
//
//        PageRequest pageRequest = PageRequest.of(1, 10);
//        Page<UserMission> userMissions = userMissionDto.findUserMissionByUser(user, pageRequest);
//
//        return UserMissionConverter.toUserMissionPreviewListDTO(userMissions);
//    }
//
//    @Override
//    public UserMissionResDTO.UsertMissionVeiwDTO findeUserMissionByStatus(UserMissionResDTO.GetMissionListDTO req) {
//
//
//            User user = userRepository.findById(req.userId())
//                    .orElseThrow(() -> new IllegalArgumentException("User not found"));
//
//            UserMission mission = userMissionRepository.findById(req.userMissionId())
//                    .orElseThrow(() -> new IllegalArgumentException("UserMission not found"));
//            Status targetStatus = Status.CHALLENGING; // 예: 도전 중인 미션만 조회
//            PageRequest pageRequest = PageRequest.of(1, 10);
//            Page<UserMission> userMissions = userMissionRepository.findAllByUserAndStatus(user, targetStatus, pageRequest);
//
//            return UserMissionConverter.toUserMissionPreviewListDTO(userMissions);
//    }
//
//
//}
