package com.example.demo.domain.reveiw.repository;

import com.example.demo.domain.reveiw.entity.Reveiw;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.demo.domain.reveiw.entity.QReveiw.reveiw;

@Repository
@RequiredArgsConstructor
public class ReveiwRepositoryImpl implements ReviewQueryDsl {

    private final EntityManager em;
    private final ReveiwRepository reveiwRepository;

    @Override
    public List<Reveiw> searchReveiw(
            Predicate predicate
    ){
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);

        return queryFactory
                .selectFrom(reveiw)
                .where(predicate)
                .orderBy(
                        reveiw.store.name.asc(),
                        reveiw.scope.desc())
                .fetch();
    }
}
