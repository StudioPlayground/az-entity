package com.azit.aziterd.entity.account;

import com.azit.aziterd.entity.common.BaseTimeEntity;
import com.azit.aziterd.entity.common.Email;
import com.azit.aziterd.entity.common.Gender;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Account extends BaseTimeEntity {

    @Id
    @Embedded
    @GeneratedValue
    private AccountId id;

    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Embedded
    private Email email;

    @Embedded
    private AccountProfile profile;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @Enumerated(EnumType.STRING)
    private AccountRole role;

}
