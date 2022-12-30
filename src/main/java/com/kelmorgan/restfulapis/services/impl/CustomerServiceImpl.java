package com.kelmorgan.restfulapis.services.impl;

import com.kelmorgan.restfulapis.api.v1.mapper.CustomerMapper;
import com.kelmorgan.restfulapis.api.v1.model.CustomerDto;
import com.kelmorgan.restfulapis.api.v1.model.CustomerListDto;
import com.kelmorgan.restfulapis.repositories.CustomerRepository;
import com.kelmorgan.restfulapis.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;
    private final CustomerMapper customerMapper;

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDTO) {

        return customerMapper.customerToCustomerDto(
                repository.save(customerMapper.customerDtoToCustomer(customerDTO)));
    }

    @Override
    public CustomerListDto getAllCustomers() {
        return CustomerListDto.builder()
                .customerDtoList(
                        customerMapper.customersToCustomerDtos(repository.findAll()))
                .build();
    }

    @Override
    public CustomerListDto saveAllCustomers(List<CustomerDto> customers) {

        return CustomerListDto.builder()
                .customerDtoList(
                        customerMapper.customersToCustomerDtos(
                                repository.saveAll(customerMapper.customerDtosToCustomers(customers))))
                .build();
    }
}
