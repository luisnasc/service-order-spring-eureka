package com.livecoding.dio.delivery.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="delivery", url="http://localhost:8082/api/v1/")
public interface FeignOrder {

    @GetMapping("/order/{id}")
    Order getOrderById(@PathVariable Long id);
}
