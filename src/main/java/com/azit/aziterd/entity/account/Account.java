package com.azit.aziterd.entity.account;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Account {

  @Id
  @GeneratedValue
  private Long id;

  private LocalDate birthDate;

  @Enumerated(EnumType.STRING)
  private Gender gender;

  private Email email;

  @Enumerated(EnumType.STRING)
  private AccountStatus status;

  @Enumerated(EnumType.STRING)
  private AccountRole role;

}
