package com.azit.aziterd.entity.purpose;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Purpose {

    @Id
    @GeneratedValue
    private PurposeId id;

}
