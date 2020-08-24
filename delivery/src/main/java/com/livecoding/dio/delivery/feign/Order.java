package com.livecoding.dio.delivery.feign;

public class Order {

    private long id;
    private long customer_id;
    private String description;
    private long value;

    public Order(long id, long customer_id, String description, long value) {
        this.id = id;
        this.customer_id = customer_id;
        this.description = description;
        this.value = value;
    }

    public Order(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", description='" + description + '\'' +
                ", value=" + value +
                '}';
    }
}
