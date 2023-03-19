package com.eyamattoussi.productservice.model.entity;

import com.eyamattoussi.productservice.model.enumeration.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.Date;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private String password;
    private String confirmPassword;


}
