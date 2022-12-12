package com.folksdevbank.folksdevbank.service;

import com.folksdevbank.folksdevbank.dto.customer.CreateCustomerRequest;
import com.folksdevbank.folksdevbank.dto.customer.CustomerDto;
import com.folksdevbank.folksdevbank.dto.customer.CustomerDtoConverter;
import com.folksdevbank.folksdevbank.dto.customer.UpdateCustomerRequest;
import com.folksdevbank.folksdevbank.model.City;
import com.folksdevbank.folksdevbank.model.Customer;
import com.folksdevbank.folksdevbank.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerDtoConverter customerDtoConverter;

    public CustomerService(CustomerRepository customerRepository, CustomerDtoConverter customerDtoConverter) {
        this.customerRepository = customerRepository;
        this.customerDtoConverter = customerDtoConverter;
    }
    /*    CustomerControllers dan gelen CreateCustomerRequesti yeni bir customer nesnesi oluşturmak için
    *     kullandık. Ardından ara bir katman CustomerDto tipinde geri dönmek istedik. Fakat geri dönüş tipimiz
    *     CustomerDto olduğundan dolayı customer --> customerDto dönüşümü yapıldı.
    * */
    public CustomerDto createCustomer(CreateCustomerRequest customerRequest){
        Customer customer = new Customer();
        customer.setId(customerRequest.getId());
        customer.setAdress(customerRequest.getAddress());
        customer.setName(customerRequest.getName());
        customer.setDateOfBirth(customerRequest.getDateOfBirth());
        customer.setCity(City.valueOf(customerRequest.getCity().name()));

        customerRepository.save(customer);

        return customerDtoConverter.convert(customer);
    }

    public List<CustomerDto> getAllCustomers(){
        List<Customer> customerList = customerRepository.findAll(); //customer türünde bir list getirir bize
        List<CustomerDto> customerDtoList = new ArrayList<>();
        for (Customer customer:customerList){
            customerDtoList.add(customerDtoConverter.convert(customer));
        }
        return customerDtoList;
    }

    public CustomerDto getCustomerDtoById(String id){
        Optional<Customer> customerOptional = customerRepository.findById(id);
        //Customer customer = customerOptional.get();   Böyle bir kod yazıldığında program optionalin null dönmesi
        //                                              durumunda hata fırlatır.
        return customerOptional.map(customerDtoConverter::convert).orElse(new CustomerDto());
    }

    public void deleteCustomer(String id){
        customerRepository.deleteById(id);
    }

    public CustomerDto updateCustomer(String id, UpdateCustomerRequest customerRequest){
        Optional<Customer> customerOptional = customerRepository.findById(id);
        customerOptional.ifPresent(customer -> {
            customer.setName(customerRequest.getName());
            customer.setCity(City.valueOf(customerRequest.getCity().name()));
            customer.setAdress(customer.getAdress());
            customer.setDateOfBirth(customer.getDateOfBirth());
            customerRepository.save(customer);
        });
        return customerOptional.map(customerDtoConverter::convert).orElse(new CustomerDto());
    }

    protected Customer getCustomerById(String id){
        return customerRepository.findById(id).orElse(new Customer());
    }
}
