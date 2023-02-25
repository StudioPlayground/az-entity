package com.azit.aziterd.entity.agitmember;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AgitMember {

  @Id
  @Embedded
  AgitMemberId id;
}
