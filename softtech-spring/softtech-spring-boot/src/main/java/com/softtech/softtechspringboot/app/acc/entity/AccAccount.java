package com.softtech.softtechspringboot.app.acc.entity;

import com.softtech.softtechspringboot.app.acc.enums.AccAccountType;
import com.softtech.softtechspringboot.app.acc.enums.AccCurrencyType;
import com.softtech.softtechspringboot.app.gen.enums.GenStatusType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ACC_ACCOUNT")
@Getter
@Setter
public class AccAccount {

    @Id
    @GeneratedValue(generator = "AccAccount")
    @SequenceGenerator(name = "AccAccount" , sequenceName = "ACC_ACCOUNT_ID_SEQ")
    private Long id;

    @Column(name = "ID_CUS_CUSTOMER")  // Bu şekil isimlendirme yapmak avantajlıdır. ID BAŞ TARAFTA!!
    private Long cusCustomerId;

    @Column(name = "IBAN_NO", length = 30)
    private String ibanNo;

    @Column(name = "CURRENT_BALANCE", precision = 19, scale = 2)
    private BigDecimal currentBalance;

    @Enumerated(EnumType.STRING)
    @Column(name = "CURRENCY_TYPE", length = 30)
    private AccCurrencyType currencyType;

    @Enumerated(EnumType.STRING)
    @Column(name = "ACCOUNT_TYPE", length = 30)
    private AccAccountType accountType;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS_TYPE", length = 30)
    private GenStatusType statusType;
}
