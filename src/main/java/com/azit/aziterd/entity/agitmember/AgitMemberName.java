package com.azit.aziterd.entity.agitmember;

import jakarta.persistence.Embeddable;
import lombok.RequiredArgsConstructor;

@Embeddable
@RequiredArgsConstructor
public record AgitMemberName(
    String name
) {
}
