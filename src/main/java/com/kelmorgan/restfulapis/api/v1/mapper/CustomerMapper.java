package com.kelmorgan.restfulapis.api.v1.mapper;

import com.kelmorgan.restfulapis.domain.Customer;
import com.kelmorgan.restfulapis.api.v1.model.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerDto customerToCustomerDto (Customer customer);
    Customer customerDtoToCustomer (CustomerDto customerDto);
    List<Customer> customerDtosToCustomers(List<CustomerDto> customers);
    List<CustomerDto> customersToCustomerDtos(List<Customer> customers);

}
