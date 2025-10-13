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

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="mission_id")
    private Mission mission;

    @OneToOne
    @JoinColumn(name = "reveiw_id")
    private Reveiw reveiw;
}
