package com.azit.aziterd.entity.agitmember;

import com.azit.aziterd.entity.common.Identifier;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

@Embeddable
@RequiredArgsConstructor
public record AgitMemberId(
    Long id
) implements Identifier {
}
