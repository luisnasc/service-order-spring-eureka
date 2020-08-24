package com.livecoding.dio.order.repository;

import com.livecoding.dio.order.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//@FeignClient(name="customer", url="http://localhost:8081/api/v1/")
public interface OrderRepository extends JpaRepository<Order, Long> {

   // @GetMapping("/products/customer/{custId}")
    //List listProductsByCustomerId(@PathVariable String custId);

}
