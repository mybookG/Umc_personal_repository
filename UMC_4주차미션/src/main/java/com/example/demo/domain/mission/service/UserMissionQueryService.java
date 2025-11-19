package com.example.demo.domain.mission.service;

import com.example.demo.domain.mission.dto.UserMissionResDTO;
import com.example.demo.domain.reveiw.ReveiwDTO;
import com.example.demo.domain.reveiw.entity.Reveiw;

import java.util.List;

public interface UserMissionQueryService {
    List<Reveiw> search(
            String filter,
            String type
    )throws Exception;
    UserMissionResDTO.UsertMissionVeiwDTO findUserMissionById();
    UserMissionResDTO.UsertMissionVeiwDTO findeUserMissionByStatus();
}
