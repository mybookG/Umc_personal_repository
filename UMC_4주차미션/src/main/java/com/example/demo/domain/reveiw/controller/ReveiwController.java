package com.example.demo.domain.reveiw.controller;

import com.example.demo.domain.reveiw.entity.QReveiw;
import com.example.demo.domain.reveiw.entity.Reveiw;
import com.example.demo.domain.reveiw.repository.ReviewQueryDsl;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")

public class ReveiwController {

    private final ReviewQueryDsl reviewQueryDsl;

    @GetMapping
    public List<Reveiw> getReviews(@RequestParam Long userId) {
        Predicate predicate = QReveiw.reveiw.userId.eq(userId);
        return reviewQueryDsl.searchReveiw(predicate);
    }
}

