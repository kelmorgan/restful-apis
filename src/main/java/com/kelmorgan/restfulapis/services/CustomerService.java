package com.kelmorgan.restfulapis.services;

import com.kelmorgan.restfulapis.api.v1.model.CustomerDto;
import com.kelmorgan.restfulapis.api.v1.model.CustomerListDto;

import java.util.List;

public interface CustomerService {


    CustomerDto saveCustomer(CustomerDto customerDTO);
    CustomerListDto getAllCustomers();

    CustomerListDto saveAllCustomers(List<CustomerDto> customers);
}
