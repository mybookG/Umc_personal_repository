package com.example.demo.domain.user.entity;

import com.example.demo.domain.alram.entity.Alram;
import com.example.demo.domain.inquiry.entity.Inquiry;
import com.example.demo.domain.mission.entity.UserMission;
import com.example.demo.domain.reveiw.entity.Reveiw;
import com.example.demo.domain.store.entity.Store;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.domain.user.enums.Gender;


@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(exclude = "userMissions")
@Getter
@Table(name="User")
public class User {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="name", length=20, nullable=false)
    private String name;

    @Column(name="gender",nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name="dateBirth", nullable=false)
    private LocalDate dateBirth;

    @Column(name="address",length=100,nullable=false)
    private String address;

    @Column(name="created_at", nullable=false)
    private LocalDateTime created_at;

    @Column(name="updated_at",nullable=false)
    private LocalDateTime updated_at;

    @Column(name="inactived_at")
    private LocalDateTime inactived_at;

    @Column(name="point", nullable=false)
    private long point;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserMission> userMissions;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id") // Alram 테이블에 외래키 생성
    private List<Alram> alrams;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Inquiry> inquirys;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Store> stores;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reveiw> reveiws;
}
