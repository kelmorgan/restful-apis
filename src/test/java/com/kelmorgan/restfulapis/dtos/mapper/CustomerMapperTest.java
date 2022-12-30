package com.kelmorgan.restfulapis.dtos.mapper;

import com.kelmorgan.restfulapis.api.v1.mapper.CustomerMapper;
import com.kelmorgan.restfulapis.domain.Customer;
import com.kelmorgan.restfulapis.api.v1.model.CustomerDto;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CustomerMapperTest {

    CustomerMapper mapper = CustomerMapper.INSTANCE;

    @Test
    void customerToCustomerDto() {
        Customer customer = Customer.builder()
                .id(1L)
                .firstName("Kufre")
                .lastName("Godwin")
                .build();

        CustomerDto customerDTO = mapper.customerToCustomerDto(customer);

        System.out.println(customerDTO);
        assertThat(customerDTO.getFirstName()).isNotNull();
        assertThat(customerDTO.getFirstName()).isEqualTo(customer.getFirstName());
    }

    @Test
    void customerDtoToCustomer() {
    }
}