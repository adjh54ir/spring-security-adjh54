package com.adjh.sprsecurity.mapper;

import com.adjh.sprsecurity.model.UserDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserMapper {

    Optional<UserDto> login(UserDto userDto);

    List<UserDto> selectUserList(UserDto userDto);

}
