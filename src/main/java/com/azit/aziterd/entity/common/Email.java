package com.azit.aziterd.entity.common;

import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Embeddable
public record Email(String email) {

}
