package com.azit.aziterd.entity.accountpurpose;

import com.azit.aziterd.entity.account.Account;
import com.azit.aziterd.entity.purpose.Purpose;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
