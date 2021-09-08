package org.example.demo.user.service;

import lombok.RequiredArgsConstructor;
import org.example.demo.user.entity.User;
import org.example.demo.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

// Sep 8, 2021
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper mapper;

    public User getById(Long id) {
        return mapper.getById(id);
    }

}
