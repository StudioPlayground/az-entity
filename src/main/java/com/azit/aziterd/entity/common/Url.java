package com.azit.aziterd.entity.common;

import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public record Url(
    String url
) {
}
