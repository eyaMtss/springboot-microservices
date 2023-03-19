package com.eyamattoussi.usersservice.mapper;

import com.eyamattoussi.usersservice.dto.UsersRequestDto;
import com.eyamattoussi.usersservice.dto.UsersResponseDto;
import com.eyamattoussi.usersservice.model.entity.Users;

public interface UsersMapper {
    UsersResponseDto userToUserResponseDto(Users user);
    Users userRequestDtoToUser(UsersRequestDto usersRequestDto);
}
