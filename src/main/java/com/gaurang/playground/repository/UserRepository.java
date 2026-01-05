package com.gaurang.playground.repository;

import com.gaurang.playground.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
