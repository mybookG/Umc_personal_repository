package com.example.demo.domain.mission.repository;

import com.example.demo.domain.mission.entity.Mission;
import com.example.demo.domain.mission.entity.UserMission;
import com.example.demo.domain.user.entity.User;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;

public interface UserMissionRepository extends JpaRepository<UserMission, Long> {
    @Query("SELECT m from UserMission m where m.user = :user")
    Page<UserMission> findUserMissionByUserId(@Param("user_id")long user, Pageable pageable);
}
