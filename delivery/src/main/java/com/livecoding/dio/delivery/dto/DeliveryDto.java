package com.livecoding.dio.delivery.dto;

import com.livecoding.dio.delivery.feign.Order;
import com.livecoding.dio.delivery.model.Delivery;

public class DeliveryDto extends Delivery {

    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
