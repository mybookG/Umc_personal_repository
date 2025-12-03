//package com.example.demo.domain.reveiw.service;
//
//import com.example.demo.domain.mission.entity.UserMission;
//import com.example.demo.domain.mission.repository.UserMissionRepository;
//import com.example.demo.domain.reveiw.ReveiwDTO;
////import com.example.demo.domain.reveiw.converter.ReveiwConverter;
//import com.example.demo.domain.reveiw.entity.Reveiw;
//import com.example.demo.domain.reveiw.repository.ReveiwRepository;
//import com.example.demo.domain.store.entity.Store;
//import com.example.demo.domain.store.repository.StoreRepository;
//import com.example.demo.domain.user.entity.User;
//import com.example.demo.domain.user.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import static com.example.demo.domain.user.entity.QUser.user;
//
//@Service
//@RequiredArgsConstructor
//public class ReveiwService {
//
//    private final ReveiwRepository reveiwRepository;
//    private final UserRepository userRepository;
//    private final StoreRepository storeRepository;
//    private final UserMissionRepository userMissionRepository;
//
//    @Transactional
//    public ReveiwDTO.ReveiwSaveResDTO saveReview(ReveiwDTO.ReveiwSaveReqDTO req) {
//
//        User user = userRepository.findById(req.userId())
//                .orElseThrow(() -> new IllegalArgumentException("User not found"));
//
//        Store store = storeRepository.findById(req.storeId())
//                .orElseThrow(() -> new IllegalArgumentException("Store not found"));
//
//        UserMission mission = userMissionRepository.findById(req.userMissionId())
//                .orElseThrow(() -> new IllegalArgumentException("UserMission not found"));
//
//        Reveiw reveiw = ReveiwConverter.toEntity(req, user, store, mission);
//
//        reveiwRepository.save(reveiw);
//
//        return ReveiwConverter.toResDTO(reveiw);
//    }
//
//    public ReveiwDTO.ReveiwViewDTO viewDto(ReveiwDTO.ReveiwViewMissionDTO req) {
//
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
//
//    public ReveiwDTO.ReveiwViewDTO viewByIdDto(ReveiwDTO.ReveiwViewMissionDTO req) {
//
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
//    }
//}
//
//
