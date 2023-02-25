package com.azit.aziterd.entity.account;

import com.azit.aziterd.entity.common.Url;
import jakarta.persistence.Embeddable;
import java.util.List;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public record AccountProfile(
    ProfileNickname nickname,
    Url url,
    List<AccountPurpose> interestPurposeList
) {

}
