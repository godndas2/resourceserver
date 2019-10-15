package com.oauth.controller;

import com.oauth.model.User;
import com.oauth.repo.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1")
public class UserController {

    private final UserJpaRepository userJpaRepository;

    @GetMapping(value = "/users")
    public List<User> findAllUser() {
        return userJpaRepository.findAll();
    }
}
