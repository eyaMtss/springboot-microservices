package com.eyamattoussi.productservice.mapper;

import com.eyamattoussi.productservice.dto.UsersRequestDto;
import com.eyamattoussi.productservice.dto.UsersResponseDto;
import com.eyamattoussi.productservice.model.entity.Users;

public interface UsersMapper {
    UsersResponseDto userToUserResonseDto(Users user);
    Users userRequestDtoToUser(UsersRequestDto usersRequestDto);
}
