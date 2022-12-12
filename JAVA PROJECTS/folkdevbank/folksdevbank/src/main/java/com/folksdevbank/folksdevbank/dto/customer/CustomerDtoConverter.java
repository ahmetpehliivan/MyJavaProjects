package com.folksdevbank.folksdevbank.dto.customer;

import com.folksdevbank.folksdevbank.dto.CityDto;
import com.folksdevbank.folksdevbank.dto.customer.CustomerDto;
import com.folksdevbank.folksdevbank.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {

    public CustomerDto convert(Customer customer){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setAddress(customer.getAdress());
        customerDto.setCity(CityDto.valueOf(customer.getCity().name()));
        customerDto.setName(customer.getName());
        customerDto.setDateOfBirth(customer.getDateOfBirth());

        return customerDto;
    }
}
