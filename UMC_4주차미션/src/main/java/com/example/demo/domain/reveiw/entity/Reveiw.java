package com.example.demo.domain.reveiw.entity;

import com.example.demo.domain.mission.entity.Mission;
import com.example.demo.domain.mission.entity.UserMission;
import com.example.demo.domain.store.entity.Store;
import com.example.demo.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Setter
@Table(name="reveiw")
public class Reveiw {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="title", nullable=false, length=20)
    private String title;

    @Column(name= "description", nullable=false, length=100)
    private String description;

    @Column(name = "image")
    private String image;

    @Column(name="scope", nullable=false)
    private int scope;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="store_id")
    private Store store;

    @OneToOne(mappedBy = "reveiw", cascade = CascadeType.ALL, orphanRemoval = true)
    private UserMission userMission;
}
