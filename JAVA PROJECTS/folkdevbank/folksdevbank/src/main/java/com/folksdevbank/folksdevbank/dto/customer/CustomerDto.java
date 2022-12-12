package com.folksdevbank.folksdevbank.dto.customer;

import com.folksdevbank.folksdevbank.dto.CityDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private String id;
    private String name;
    private Integer dateOfBirth;
    private CityDto city;
    private String address;
}
