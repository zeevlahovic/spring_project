package com.zee.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.zee.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String email;
    private String password;
    private String username;
    private UserRole role = UserRole.USER;

    @JsonManagedReference
    private AccountDTO account;
    private boolean deleted;

}
