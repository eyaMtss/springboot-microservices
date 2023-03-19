package com.eyamattoussi.usersservice.controller;

import com.eyamattoussi.usersservice.dto.UsersRequestDto;
import com.eyamattoussi.usersservice.dto.UsersResponseDto;
import com.eyamattoussi.usersservice.exception.UserNotFoundException;
import com.eyamattoussi.usersservice.service.UsersServiceImpl;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("users")
@Slf4j
public class UsersController {
    @Autowired
    private UsersServiceImpl usersService;

    static Logger logger = LoggerFactory.getLogger(UsersController.class);

    @PostMapping(path = "/add")
    public ResponseEntity<UsersResponseDto> addUser(@Valid @RequestBody UsersRequestDto UsersRequestDTO) {
        return new ResponseEntity<>(usersService.saveUser(UsersRequestDTO), HttpStatus.CREATED);
    }

    @PutMapping(path = "/update/{userId}")
    public ResponseEntity<UsersResponseDto> updateUser(@PathVariable Long userId, @Valid @RequestBody UsersRequestDto UsersRequestDTO){
        try {
            return new ResponseEntity<>(usersService.updateUser(userId, UsersRequestDTO), HttpStatus.CREATED);
        } catch (Exception e) {
            throw new UserNotFoundException("User not found");
        }
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<UsersResponseDto>> getUsers() {
        return ResponseEntity.ok().body(usersService.getAllUsers());
    }
    @GetMapping("/getById/{userId}")
    public ResponseEntity<UsersResponseDto> getUserById(@PathVariable Long userId) {
        if(usersService.isExist(userId)) {
            return ResponseEntity.ok().body(usersService.getUserById(userId));
        }
        else {
            throw new UserNotFoundException("User doesn't exist");
        }

    }
    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<Object> deleteUser(@PathVariable Long userId) {
        try {
            usersService.deleteUser(userId);
            return ResponseEntity.noContent().build();
        } catch (Exception ex) {
            throw new UserNotFoundException("User doesn't exist");
        }
    }
}
