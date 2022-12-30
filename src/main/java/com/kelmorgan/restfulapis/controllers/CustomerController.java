package com.kelmorgan.restfulapis.controllers;

import com.kelmorgan.restfulapis.api.v1.model.CustomerDto;
import com.kelmorgan.restfulapis.api.v1.model.CustomerListDto;
import com.kelmorgan.restfulapis.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    private final CustomerService customerService;
    public static final String BASE_URL = "/api/v1/customers";

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CustomerListDto getAllCustomers() {
        return customerService.getAllCustomers();
    }

}
