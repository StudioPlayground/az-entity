package com.azit.aziterd.entity.agit;

import com.azit.aziterd.entity.common.BaseTimeEntity;
import com.azit.aziterd.entity.common.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AgitGenderRestriction extends BaseTimeEntity {

  @Id
  @GeneratedValue
  private Long id;

  @ManyToOne
  private Agit agit;

  @Enumerated(EnumType.STRING)
  private Gender gender;

}
