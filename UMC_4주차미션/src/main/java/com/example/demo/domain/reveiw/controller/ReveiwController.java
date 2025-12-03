//package com.example.demo.domain.reveiw.controller;
//
//import com.example.demo.domain.reveiw.ReveiwDTO;
//import com.example.demo.domain.reveiw.entity.QReveiw;
//import com.example.demo.domain.reveiw.entity.Reveiw;
//import com.example.demo.domain.reveiw.exception.ReveiwSuccessCode;
//import com.example.demo.domain.reveiw.repository.ReveiwQueryDsl;
//import com.example.demo.domain.reveiw.repository.ReveiwRepository;
//import com.example.demo.domain.reveiw.service.ReveiwQueryService;
//import com.example.demo.domain.reveiw.service.ReveiwService;
//import com.example.demo.global.apiPayload.ApiResponse;
//import com.example.demo.global.apiPayload.GeneralSuccessCode;
//import com.querydsl.core.types.Predicate;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/reviews")
//public class ReveiwController implements ReveiwControllerDocs{
//
//    private final ReveiwQueryDsl reveiwQueryDsl;
//    private final ReveiwService reveiwService;
//    private final ReveiwQueryService reveiwQueryService;
//
//    // ==============================
//    //  리뷰 조회 (userId 기준)
//    // ==============================
//    @GetMapping
//    public ApiResponse<List<Reveiw>> getReviews(@RequestParam Long userId) {
//        Predicate predicate = QReveiw.reveiw.user.id.eq(userId);
//        List<Reveiw> reviews = reveiwQueryDsl.searchReveiw(predicate);
//        return ApiResponse.onSuccess(GeneralSuccessCode.OK, reviews);
//    }
//
//    // ==============================
//    //  리뷰 저장
//    // ==============================
//    @PostMapping("/save")
//    public ApiResponse<ReveiwDTO.ReveiwSaveResDTO> save(
//            @RequestBody ReveiwDTO.ReveiwSaveReqDTO dto
//    ) {
//        return ApiResponse.onSuccess(
//                GeneralSuccessCode.OK,
//                reveiwService.saveReview(dto)
//        );
//    }
//
//    @GetMapping
//    public ApiResponse<ReveiwDTO.ReveiwViewMissionDTO> getStoreReviews(){
//
//        ReveiwSuccessCode code = ReveiwSuccessCode.FOUND;
//        return ApiResponse.onSuccess(code, reveiwQueryService.findReveiwByStore());
//    }
//
//    @GetMapping
//    public ApiResponse<ReveiwDTO.ReveiwViewMissionDTO> getIdReviews(){
//
//        ReveiwSuccessCode code = ReveiwSuccessCode.FOUND;
//        return ApiResponse.onSuccess(code, reveiwQueryService.findReveiwById());
//    }
//}
