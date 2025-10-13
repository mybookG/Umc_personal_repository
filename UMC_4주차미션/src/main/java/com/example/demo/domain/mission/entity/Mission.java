package com.example.demo.domain.mission.entity;


import com.example.demo.domain.store.entity.Store;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name="mission")
@Setter
public class Mission {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title",length = 30,nullable = false)
    private String title;

    @Column(name="m_poit",nullable = false)
    private int m_point;

    @Column(name="check",length = 8,nullable = false)
    private String check;

    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserMission> userMissions;

    @ManyToOne
    @JoinColumn(name="store")
    private Store store;
}
