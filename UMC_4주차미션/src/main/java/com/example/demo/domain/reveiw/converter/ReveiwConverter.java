//package com.example.demo.domain.reveiw.converter;
//
//import com.example.demo.domain.reveiw.ReveiwDTO;
//import com.example.demo.domain.reveiw.entity.Reveiw;
//import com.example.demo.domain.mission.entity.UserMission;
//import com.example.demo.domain.store.entity.Store;
//import com.example.demo.domain.user.entity.User;
//import org.hibernate.query.Page;
//
//public class ReveiwConverter {
//
//    // DTO + 조회된 객체 → Entity
//    public static Reveiw toEntity(
//            ReveiwDTO.ReveiwSaveReqDTO dto,
//            User user,
//            Store store,
//            UserMission mission
//    ) {
//        return Reveiw.builder()
//                .title(dto.title())
//                .description(dto.description())
//                .image(dto.image())
//                .scope(dto.scope())
//                .user(user)
//                .store(store)
//                .userMission(mission)
//                .build();
//    }
//
//    // Entity → 저장 결과 DTO
//    public static ReveiwDTO.ReveiwSaveResDTO toResDTO(Reveiw reveiw) {
//        return ReveiwDTO.ReveiwSaveResDTO.builder()
//                .id(reveiw.getId())
//                .build();
//    }
//
//    public static ReveiwDTO.ReveiwViewMissionDTO toReviewPreviewListDTO(
//            Page<Reveiw> result
//    ){
//        return ReveiwDTO.ReveiwViewMissionDTO.builder()
//                .reveiwViewDTOList(result.getContent().stream()
//                        .map(ReviewConverter::toReviewPreviewDTO)
//                        .toList()
//                )
//                .listSize(result.getSize())
//                .totalPage(result.getTotalPages())
//                .totalElements(result.getTotalElements())
//                .isFirst(result.isFirst())
//                .isLast(result.isLast())
//                .build();
//    }
//
//    public static ReveiwDTO.ReveiwViewMissionDTO toReviewPreviewDTO(
//            Reveiw review
//    ){
//        return ReveiwDTO.ReveiwViewDTO.builder()
//                .userId(review.getId())
//                .storeId(review.getStore().getId())
//                .userMissionId(review.getUserMission().getId())
//                .title(review.getTitle())
//                .description(review.getDescription())
//                .image(review.getImage())
//                .scope(review.getScope())
//                .build();
//    }
//}
//}
