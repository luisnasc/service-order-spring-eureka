package com.livecoding.dio.delivery.model;

import javax.persistence.*;

@Entity
@Table(name = "delivery")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long deliveryId;

    @Column(name = "order_id", nullable = false)
    public long orderId;

    @Column(name = "customer_id", nullable = false)
    private long customerId;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "shippingValue", nullable = false)
    private long shippingValue;

    public Delivery(long orderId, long customerId, long deliveryId, String address, long shippingValue) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.deliveryId = deliveryId;
        this.address = address;
        this.shippingValue = shippingValue;
    }

    public Delivery(){

    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getShippingValue() {
        return shippingValue;
    }

    public void setShippingValue(long shippingValue) {
        this.shippingValue = shippingValue;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", deliveryId=" + deliveryId +
                ", address='" + address + '\'' +
                ", shippingValue=" + shippingValue +
                '}';
    }
}
