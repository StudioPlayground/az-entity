package com.azit.aziterd.entity.agit;

import com.azit.aziterd.entity.common.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Agit extends BaseTimeEntity {
  @Id
  @GeneratedValue
  private Long id;

  // range
  private Long ageStartIncludeRestriction;
  private Long ageEndExclusiveRestriction;

  // people
  private Long peopleEndExclusiveRestrictions;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "agit")
  private List<AgitGenderRestriction> genderRestrictions;


  // TODO: 2023/02/25 agitinfo 해야함 특히 DefaultContract DB 로 변환
}
