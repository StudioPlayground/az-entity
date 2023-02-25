package com.azit.aziterd.entity.account;

import com.azit.aziterd.entity.purpose.Purpose;
import com.azit.aziterd.entity.purpose.PurposeId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class AccountPurpose {

    @Id
    @GeneratedValue
    private AccountPurposeId id;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "purpose_id")
    private Purpose purpose;

}
