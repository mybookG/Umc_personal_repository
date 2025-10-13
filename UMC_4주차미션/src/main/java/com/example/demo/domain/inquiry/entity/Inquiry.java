package com.example.demo.domain.inquiry.entity;

import com.example.demo.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name="inquiry")
@Setter
public class Inquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title", nullable=false, length=50)
    private String title;

    @Column(name="content", nullable=false, length=500)
    private String content;

    @Column(name = "image")
    private String image;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
