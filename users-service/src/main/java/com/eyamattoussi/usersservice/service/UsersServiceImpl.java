package com.eyamattoussi.usersservice.service;

import com.eyamattoussi.usersservice.dto.UsersRequestDto;
import com.eyamattoussi.usersservice.dto.UsersResponseDto;
import com.eyamattoussi.usersservice.repository.UsersRepository;
import com.eyamattoussi.usersservice.mapper.UsersMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;
    private UsersMapperImpl usersMapper;
    @Override
    public List<UsersResponseDto> getAllUsers() {
        return usersRepository.findAll().stream(user -> usersMapper.userToUserResponseDto(user)).toList();
    }

    @Override
    public UsersResponseDto getUserById(Long id) {
        return null;
    }

    @Override
    public UsersResponseDto saveUser(UsersRequestDto usersRequestDto) {
        return null;
    }

    @Override
    public UsersResponseDto updateUser(Long id, UsersRequestDto usersRequestDto) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public Boolean isExist(Long id) {
        return null;
    }
}
