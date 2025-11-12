package com.example.demo.domain.mission.entity;

import com.example.demo.domain.store.entity.Store;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@Table(name = "missions")
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 30, nullable = false)
    private String title;

    @Column(name = "m_point", nullable = false)
    private int mPoint; // ✅ 오타 수정

    @Column(name = "check_status", length = 8, nullable = false)
    private String checkStatus;

    // ✅ Mission : Store = 다대일 (여러 미션이 하나의 가게에 속함)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id", nullable = false)
    private Store store;
}
