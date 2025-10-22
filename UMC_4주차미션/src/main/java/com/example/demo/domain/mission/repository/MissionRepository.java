package com.example.demo.domain.mission.repository;

import com.example.demo.domain.mission.entity.Mission;
import com.example.demo.dto.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MissionRepository extends JpaRepository<Mission, Long> {

    @Query("""
    SELECT new com.example.demo.dto.Home(u.id, m.title, m.m_point, s.name, s.address, u.point)
    FROM UserMission um
    JOIN um.user u
    JOIN um.mission m
    JOIN m.store s
    WHERE u.id = :userId
""")
    Page<Home> findHomeByUserId(@Param("userId") Long userId, Pageable pageable);

}
