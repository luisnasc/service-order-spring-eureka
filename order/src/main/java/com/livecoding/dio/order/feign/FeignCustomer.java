package com.livecoding.dio.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="customer", url="http://localhost:8081/api/v1/")
public interface FeignCustomer {
    @GetMapping("/customer/{id}")
    Customer getCustomerById(@PathVariable Long id);
}
