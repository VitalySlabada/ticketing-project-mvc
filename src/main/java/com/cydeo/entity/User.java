package com.cydeo.entity;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import com.cydeo.enums.Gender;
import com.cydeo.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@NoArgsConstructor
@Data

//if class extended cannot use @AllArgConstr....

public class User extends BaseEntity{

    public User(Long id, LocalDate insertDateTime, Long insertUserId, LocalDateTime lastUpdateDateTime, Long lastUpdateUserId, String firstName, String lastName, String userName, String password, boolean enabled, Role role, Gender gender, String phone) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.passWord = password;
        this.enabled = enabled;
        this.role = role;
        this.gender = gender;
        this.phone = phone;
    }

    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private boolean enabled;
    private Role role;
    private Gender gender;
    private String phone;
}
