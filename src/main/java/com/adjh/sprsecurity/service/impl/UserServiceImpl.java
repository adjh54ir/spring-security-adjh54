package com.adjh.sprsecurity.service.impl;

import com.adjh.sprsecurity.mapper.UserMapper;
import com.adjh.sprsecurity.model.UserDto;
import com.adjh.sprsecurity.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final SqlSession sqlSession;

    public UserServiceImpl(SqlSession ss) {
        this.sqlSession = ss;
    }

    /**
     * 로그인 구현체
     *
     * @param userDto UserDto
     * @return Optional<UserDto>
     */
    @Override
    public Optional<UserDto> login(UserDto userDto) {
        UserMapper um = sqlSession.getMapper(UserMapper.class);
        return um.login(userDto);
    }

    @Override
    public List<UserDto> selectUserList(UserDto userDto) {
        UserMapper um = sqlSession.getMapper(UserMapper.class);
        return um.selectUserList(userDto);
    }
}
