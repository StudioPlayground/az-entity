package com.azit.aziterd.entity.account;

import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public record ProfileNickname(String nickname) {

}
