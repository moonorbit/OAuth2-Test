package com.gs.repository;

import com.gs.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DB 쿼리를 자동으로 작성해주고 매핑해주는 JPA 를 정의한다
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findById(String username);
}
