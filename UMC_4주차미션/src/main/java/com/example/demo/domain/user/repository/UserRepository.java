package com.example.demo.domain.user.repository;

import com.example.demo.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {// findUserById는 User를 반환해야 합니다.
    Optional<User> findUserById(@Param("id") Long id);

    // findByEmail은 Optional<User>를 반환해야 합니다.
    Optional<User> findByEmail(String email);
}
