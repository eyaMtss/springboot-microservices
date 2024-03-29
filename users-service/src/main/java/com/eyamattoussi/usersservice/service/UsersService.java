package com.eyamattoussi.usersservice.service;

import java.util.List;
import com.eyamattoussi.usersservice.dto.UsersRequestDto;
import com.eyamattoussi.usersservice.dto.UsersResponseDto;

public interface UsersService {
    List<UsersResponseDto> getAllUsers();
    UsersResponseDto getUserById(Long id);
    UsersResponseDto saveUser(UsersRequestDto usersRequestDto);
    UsersResponseDto updateUser(Long id, UsersRequestDto usersRequestDto);
    void deleteUser(Long id);
    Boolean isExist(Long id);
}
