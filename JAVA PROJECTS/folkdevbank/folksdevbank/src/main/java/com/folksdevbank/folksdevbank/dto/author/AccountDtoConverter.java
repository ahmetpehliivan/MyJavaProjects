package com.folksdevbank.folksdevbank.dto.author;

import com.folksdevbank.folksdevbank.dto.author.AccountDto;
import com.folksdevbank.folksdevbank.model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDtoConverter {

    public AccountDto convert(Account account){
        return AccountDto.builder()
                .id(account.getId())
                .balance(account.getBalance())
                .currency(account.getCurrency())
                .customerId(account.getCustomerId())
                .build();
        //AccountDto da @Builder anotasyonu tanımladığımız için böyle bir kullanım yaptık.
    }
}
