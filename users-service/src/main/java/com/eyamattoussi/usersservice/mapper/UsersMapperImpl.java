package com.eyamattoussi.usersservice.mapper;

import com.eyamattoussi.usersservice.dto.UsersRequestDto;
import com.eyamattoussi.usersservice.dto.UsersResponseDto;
import com.eyamattoussi.usersservice.model.entity.Users;
import com.eyamattoussi.usersservice.mapper.UsersMapper;

public class UsersMapperImpl implements UsersMapper {
    @Override
    public UsersResponseDto userToUserResponseDto(Users user) {
        return UsersResponseDto.builder()
                .id(user.getId())
                .username(user.getUsername())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .email(user.getEmail())
                .address(user.getAddress())
                .birthdate(user.getBirthdate())
                .gender(user.getGender())
                .build();
    }

    @Override
    public Users userRequestDtoToUser(UsersRequestDto usersRequestDto) {
        return Users.builder()
                .username(usersRequestDto.getUsername())
                .firstname(usersRequestDto.getFirstname())
                .lastname(usersRequestDto.getLastname())
                .email(usersRequestDto.getEmail())
                .address(usersRequestDto.getAddress())
                .birthdate(usersRequestDto.getBirthdate())
                .gender(usersRequestDto.getGender())
                .password(usersRequestDto.getPassword())
                .confirmPassword(usersRequestDto.getConfirmPassword())
                .build();
    }
}
