package com.example.demo.domain.store.entity;

import com.example.demo.domain.mission.entity.Mission;
import com.example.demo.domain.mission.entity.UserMission;
import com.example.demo.domain.reveiw.entity.Reveiw;
import com.example.demo.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Setter
@Table(name="store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "address", nullable = false, length = 30)
    private String address;

    @Column(name="introduce", nullable = true, length = 100)
    private String introduce;

    @Column(name = "userId", nullable = false)
    private long userId;

    @OneToMany(mappedBy = "store",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mission> missions;

    @OneToMany(mappedBy = "store",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reveiw> reveiws;
}
