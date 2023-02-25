package com.azit.aziterd.entity.agitmember;

import com.azit.aziterd.entity.common.Identifier;
import jakarta.persistence.Embeddable;
import lombok.RequiredArgsConstructor;

@Embeddable
@RequiredArgsConstructor
public record AgitMemberId(Long id) implements Identifier {
}
