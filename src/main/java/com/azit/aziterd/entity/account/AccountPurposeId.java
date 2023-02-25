package com.azit.aziterd.entity.account;

import com.azit.aziterd.entity.common.Identifier;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public record AccountPurposeId(
    Long id
) implements Identifier {

    @Override
    public boolean isNull() {
        return this.id == null;
    }

}
