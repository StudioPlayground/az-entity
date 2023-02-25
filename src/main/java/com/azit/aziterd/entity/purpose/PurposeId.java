package com.azit.aziterd.entity.purpose;

import com.azit.aziterd.entity.common.Identifier;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public record PurposeId(
    Long id
) implements Identifier {

    @Override
    public boolean isNull() {
        return this.id == null;
    }

}
