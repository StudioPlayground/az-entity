package com.azit.aziterd.entity.agitmember;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AgitMember {

  @Id
  @GeneratedValue
  private AgitMemberId id;
}
