package com.example.demospringsecurity.web.service;

import com.example.demospringsecurity.core.domain.UserEntity;
import com.example.demospringsecurity.core.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


@Service
public interface UserService extends UserDetailsService
{
    UserDto createUser(UserDto user);
    UserDto getUser(String email);
    UserDto getUserByUserId(String userId);
}
