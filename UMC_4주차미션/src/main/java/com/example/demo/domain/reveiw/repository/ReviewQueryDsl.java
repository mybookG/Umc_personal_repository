package com.example.demo.domain.reveiw.repository;

import com.example.demo.domain.reveiw.entity.Reveiw;
import com.querydsl.core.types.Predicate;
import java.util.List;

public interface ReviewQueryDsl {
    List<Reveiw> searchReveiw(Predicate predicate);
}
