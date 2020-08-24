package com.livecoding.dio.order.dto;

import com.livecoding.dio.order.feign.Customer;
import com.livecoding.dio.order.model.Order;

public class OrderDto extends Order {
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
