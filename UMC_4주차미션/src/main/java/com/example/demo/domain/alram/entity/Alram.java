package com.example.demo.domain.alram.entity;

import com.example.demo.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;
import com.example.demo.domain.alram.enums.Status;
import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Setter
@Table(name="alram")
public class Alram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="title", nullable=false, length=50)
    private String title;

    @Column(name="content", nullable=false, length=500)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(name="status", nullable=false)
    private Status status;

    @Column(name="date", nullable=false)
    private LocalDateTime date;

    @Column(name="user_id", nullable=false)
    private long user_id;
}
