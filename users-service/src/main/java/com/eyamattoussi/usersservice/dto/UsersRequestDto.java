package com.eyamattoussi.usersservice.dto;

import com.eyamattoussi.productservice.model.enumeration.Gender;
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
public class UsersRequestDto {
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private Date birthdate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String password;
    private String confirmPassword;
}
