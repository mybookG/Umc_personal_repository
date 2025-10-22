package com.example.demo.domain.reveiw.repository;

import jakarta.persistence.Entity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.reveiw.entity.Reveiw;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReveiwRepository extends JpaRepository<Reveiw, Long> {
    List<Reveiw> findByReveiwId(Long reveiwId);

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO reveiw(user_id, store_id, user_mission, title, description, image, scope) " +
                    "VALUES (:userId, :storeId, :userMission, :title, :description, :image, :scope)",
            nativeQuery = true
    )
    void insertReveiw(@Param("id") long userId, @Param("storeId") long storeId, @Param("userMission")long userMission,
                      @Param("title") String title,@Param("description") String description,@Param("image") String image,@Param("scope") int scope);
}
