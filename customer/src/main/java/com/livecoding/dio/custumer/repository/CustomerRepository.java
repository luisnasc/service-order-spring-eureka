package com.livecoding.dio.custumer.repository;

import com.livecoding.dio.custumer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
