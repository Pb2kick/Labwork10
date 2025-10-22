package com.appdev.crc.ranisg4.service;

import java.util.List;

import com.appdev.crc.ranisg4.entity.User;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    void deleteUser(Long id);
}