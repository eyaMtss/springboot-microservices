package com.eyamattoussi.usersservice.service;

import com.eyamattoussi.usersservice.dto.UsersRequestDto;
import com.eyamattoussi.usersservice.dto.UsersResponseDto;
import com.eyamattoussi.usersservice.model.entity.Users;
import com.eyamattoussi.usersservice.repository.UsersRepository;
import com.eyamattoussi.usersservice.mapper.UsersMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private UsersMapperImpl usersMapper;
    @Override
    public List<UsersResponseDto> getAllUsers() {
        return usersRepository.findAll().stream().map(user -> usersMapper.userToUserResponseDto(user)).toList();
    }

    @Override
    public UsersResponseDto getUserById(Long id) {
        return usersMapper.userToUserResponseDto(usersRepository.findById(id).get());
    }

    @Override
    public UsersResponseDto saveUser(UsersRequestDto usersRequestDto) {
        return usersMapper.userToUserResponseDto(usersRepository.save(usersMapper.userRequestDtoToUser(usersRequestDto)));
    }

    @Override
    public UsersResponseDto updateUser(Long id, UsersRequestDto usersRequestDto) {
        Users existingUser = usersRepository.findById(id).get();
        existingUser.setUsername(usersRequestDto.getUsername());
        existingUser.setFirstname(usersRequestDto.getFirstname());
        existingUser.setLastname(usersRequestDto.getLastname());
        existingUser.setEmail(usersRequestDto.getEmail());
        existingUser.setAddress(usersRequestDto.getAddress());
        existingUser.setBirthdate(usersRequestDto.getBirthdate());
        existingUser.setGender(usersRequestDto.getGender());
        existingUser.setPassword(usersRequestDto.getPassword());
        existingUser.setConfirmPassword(usersRequestDto.getConfirmPassword());
        return usersMapper.userToUserResponseDto(usersRepository.save(existingUser));
    }

    @Override
    public void deleteUser(Long id) {
        usersRepository.deleteById(id);
    }

    @Override
    public Boolean isExist(Long id) {
        return usersRepository.existsById(id);
    }
}
