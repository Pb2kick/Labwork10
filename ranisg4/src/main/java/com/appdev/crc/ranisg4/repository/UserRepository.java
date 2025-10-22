package com.appdev.crc.ranisg4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appdev.crc.ranisg4.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}