package com.kelmorgan.restfulapis.bootstrap;

import com.kelmorgan.restfulapis.services.CustomerService;
import com.kelmorgan.restfulapis.api.v1.model.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
//@RequiredArgsConstructor
//public class BootStrap implements CommandLineRunner {
//
//    private final CustomerService customerDao;
//
//    //@Override
//    public void run(String... args) throws Exception {
//
//        CustomerDto customer1 = CustomerDto.builder()
//                .firstName("Frank")
//                .lastName("Baldwin")
//                .build();
//
//        CustomerDto customer2 = CustomerDto.builder()
//                .firstName("Ken")
//                .lastName("Smith")
//                .build();
//
//        customerDao.saveAllCustomers(List.of(customer1, customer2));
//    }
//}
