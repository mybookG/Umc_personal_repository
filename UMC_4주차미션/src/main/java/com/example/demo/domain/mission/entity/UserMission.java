package com.example.demo.domain.mission.entity;

import com.example.demo.domain.reveiw.entity.Reveiw;
import com.example.demo.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;
import  com.example.demo.domain.mission.enums.Status;
import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(exclude = {"user", "mission"})
@Setter
@Table(name="userMission")
public class UserMission {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name="status",nullable=false)
    private Status status;

    @Column(name="startTime",nullable=false)
    private LocalDateTime startTime;

    @Column(name="endTime",nullable=false)
    private LocalDateTime endTime;

    @Column(name="completedTime",nullable=false)
    private LocalDateTime completedTime;

    // ✅ User와 연결
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // ✅ Mission과 연결
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id", nullable = false)
    private Mission mission;

    // ✅ 리뷰 연결 (필요시)
    @Column(name="reveiw_id", nullable=false)
    private long reveiw;
}
