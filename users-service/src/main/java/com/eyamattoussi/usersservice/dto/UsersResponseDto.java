package com.eyamattoussi.usersservice.dto;

import com.eyamattoussi.usersservice.model.enumeration.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class UsersResponseDto {
    private Long id;
    private String username;
    private String firstname;
    private String lastname;
    @Email
    private String email;
    private String address;
    private Date birthdate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
}
