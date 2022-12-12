package com.softtech.softtechspringboot.app.acc.dto;

import com.softtech.softtechspringboot.app.acc.enums.AccMoneyTransferType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccMoneyTransferSaveRequestDto {

    private Long id;
    private Long accountIdFrom;
    private Long accountIdTo;
    private BigDecimal amount;
    private String description;
    private AccMoneyTransferType transferType;
}
