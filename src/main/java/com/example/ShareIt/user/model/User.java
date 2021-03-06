package com.example.ShareIt.user.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Validated
@NoArgsConstructor
public class User {
    int id;
    String name;
    @Email
    @NotNull
    @NotBlank
    String email;

    public User(int id,  String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
