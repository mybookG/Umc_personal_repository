package com.example.demo.domain.mission.service;

import com.example.demo.domain.mission.dto.UserMissionReqDTO;
import com.example.demo.domain.mission.dto.UserMissionResDTO;
import com.example.demo.domain.mission.entity.UserMission;
import com.example.demo.domain.mission.repository.UserMissionRepository;
import com.example.demo.domain.mission.service.UserMissionCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserMissionServiceImpl implements UserMissionCommandService {

    private final UserMissionRepository userMissionRepository;

    @Override
    public UserMissionResDTO.JoinDTO saveup(UserMissionReqDTO.JoinDTO joinDTO) {
        UserMission userMission = UserMission.builder()
                .status(joinDTO.status())
                .user(joinDTO.user())
                .mission(joinDTO.mission())
                .build();

        UserMission saved = userMissionRepository.save(userMission);

        return UserMissionResDTO.JoinDTO.builder()
                .id(saved.getId())
                .status(saved.getStatus())
                .user(saved.getUser())
                .mission(saved.getMission())
                .build();
    }
}
