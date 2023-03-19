package com.eyamattoussi.usersservice.mapper;

import com.eyamattoussi.productservice.dto.UsersRequestDto;
import com.eyamattoussi.productservice.dto.UsersResponseDto;
import com.eyamattoussi.productservice.model.entity.Users;

public interface UsersMapper {
    UsersResponseDto userToUserResponseDto(Users user);
    Users userRequestDtoToUser(UsersRequestDto usersRequestDto);
}
