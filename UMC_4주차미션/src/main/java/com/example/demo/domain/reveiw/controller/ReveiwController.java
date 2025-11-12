package com.example.demo.domain.reveiw.controller;

import com.example.demo.domain.reveiw.ReveiwDTO;
import com.example.demo.domain.reveiw.entity.QReveiw;
import com.example.demo.domain.reveiw.entity.Reveiw;
import com.example.demo.domain.reveiw.repository.ReveiwQueryDsl;
import com.example.demo.global.apiPayload.ApiResponse;
import com.example.demo.global.apiPayload.GeneralSuccessCode;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReveiwController {

    private final ReveiwQueryDsl reveiwQueryDsl;

    // ✅ 리뷰 목록 조회 (userId 기준)
    @GetMapping
    public ApiResponse<List<Reveiw>> getReviews(@RequestParam Long userId) {
        Predicate predicate = QReveiw.reveiw.user.id.eq(userId);
        List<Reveiw> reviews = reveiwQueryDsl.searchReveiw(predicate);
        return ApiResponse.onSuccess(GeneralSuccessCode.OK, reviews);
    }

    @PostMapping("saveReveiw")
    public ApiResponse<ReveiwDTO.ReveiwSaveResDTO> save(
            ReveiwDTO.ReveiwSaveReqDTO dto
    ){return null;}

}

