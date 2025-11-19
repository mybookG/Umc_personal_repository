package com.example.demo.domain.mission.repository;

import com.example.demo.domain.mission.entity.UserMission;
import com.example.demo.domain.user.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserMissionRepository extends JpaRepository<UserMission, Long> {

    // User 엔티티로 조회
    @Query("SELECT m FROM UserMission m WHERE m.user = :user")
    Page<UserMission> findUserMissionByUser(@Param("user") User user, Pageable pageable);

    // User ID로 조회
    @Query("SELECT m FROM UserMission m WHERE m.user.id = :userId")
    Page<UserMission> findUserMissionByUserId(@Param("userId") Long userId, Pageable pageable);
}
