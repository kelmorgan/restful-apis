package com.kelmorgan.restfulapis.repositories;

import com.kelmorgan.restfulapis.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}