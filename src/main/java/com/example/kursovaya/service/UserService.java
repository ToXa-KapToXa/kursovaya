package com.example.kursovaya.service;

import com.example.kursovaya.dto.UserDTO;
import com.example.kursovaya.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService { // security
    boolean save(UserDTO userDTO);
    void save(User user);
    User findByName(String name);
}
