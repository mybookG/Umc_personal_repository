//package com.example.demo.domain.reveiw.service;
//
//import com.example.demo.domain.mission.entity.UserMission;
//import com.example.demo.domain.reveiw.ReveiwDTO;
//import com.example.demo.domain.reveiw.converter.ReveiwConverter;
//import com.example.demo.domain.reveiw.entity.Reveiw;
//import com.example.demo.domain.store.entity.Store;
//import com.example.demo.domain.user.entity.User;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//
//public class ReveiwQueryServiceImpl implements ReveiwQueryService{
//
//    @Override
//    public ReveiwDTO.ReveiwViewMissionDTO findReveiwById() {
//        User user = userRepository.findById(req.userId())
//                .orElseThrow(() -> new IllegalArgumentException("User not found"));
//
//        Store store = storeRepository.findById(req.storeId())
//                .orElseThrow(() -> new IllegalArgumentException("Store not found"));
//
//        UserMission mission = userMissionRepository.findById(req.userMissionId())
//                .orElseThrow(() -> new IllegalArgumentException("UserMission not found"));
//
//        PageRequest pageRequest = PageRequest.of(1, 10);
//        Page<Reveiw> reveiws = reveiwRepository.findAll(user, pageRequest);
//
//        return ReveiwConverter.toReviewPreviewDTO(reveiws);
//
//    }
//
//
//    @Override
//    public ReveiwDTO.ReveiwViewMissionDTO findReveiwByStore() {
//        User user = userRepository.findById(req.userId())
//                .orElseThrow(() -> new IllegalArgumentException("User not found"));
//
//        Store store = storeRepository.findById(req.storeId())
//                .orElseThrow(() -> new IllegalArgumentException("Store not found"));
//
//        UserMission mission = userMissionRepository.findById(req.userMissionId())
//                .orElseThrow(() -> new IllegalArgumentException("UserMission not found"));
//
//        PageRequest pageRequest = PageRequest.of(1, 10);
//        Page<Reveiw> reveiws = reveiwRepository.findAll(store, pageRequest);
//
//        return ReveiwConverter.toReviewPreviewDTO(reveiws);
//    }
//    }
//}
