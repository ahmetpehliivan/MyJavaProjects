package com.folksdevbank.folksdevbank.dto.customer;

import com.folksdevbank.folksdevbank.dto.customer.BaseCustomerRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerRequest extends BaseCustomerRequest {
    private String id;
}
