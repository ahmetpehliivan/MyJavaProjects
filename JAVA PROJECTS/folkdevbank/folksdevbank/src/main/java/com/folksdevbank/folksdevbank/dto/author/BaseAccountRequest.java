package com.folksdevbank.folksdevbank.dto.author;

import com.folksdevbank.folksdevbank.model.City;
import com.folksdevbank.folksdevbank.model.Currency;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseAccountRequest {

    private String customerId;
    private Double balance;
    private Currency currency;
    private City city;
}
