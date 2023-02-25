package com.azit.aziterd.entity.account;

import com.azit.aziterd.entity.common.Identifier;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;
import org.springframework.util.NumberUtils;

@Embeddable
@NoArgsConstructor
public record AccountId(Long id) implements Identifier {

    @Override
    public boolean isNull() {
        return this.id == null;
    }

}
