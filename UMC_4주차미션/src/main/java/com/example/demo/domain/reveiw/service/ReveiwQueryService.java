package com.example.demo.domain.reveiw.service;

import com.example.demo.domain.reveiw.ReveiwDTO;
import com.example.demo.domain.reveiw.entity.Reveiw;

import java.util.List;

public interface ReveiwQueryService {
    List<Reveiw> searchReveiw(
            String filter,
            String type
    )throws Exception;
    ReveiwDTO.ReveiwViewMissionDTO findReveiwById();
    ReveiwDTO.ReveiwViewMissionDTO findReveiwByStore();
}
