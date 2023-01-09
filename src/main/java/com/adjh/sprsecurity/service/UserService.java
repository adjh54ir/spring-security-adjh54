package com.adjh.sprsecurity.service;

import com.adjh.sprsecurity.model.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<UserDto> login(UserDto userVo);

    List<UserDto> selectUserList(UserDto userDto);
}
