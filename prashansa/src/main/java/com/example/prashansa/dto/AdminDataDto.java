package com.example.prashansa.dto;


public class AdminDataDto {

    Long productCount;
    Long ordersPlacedCount;
    Long customerCount;
    Long orderDeliveredCount;

    public Long getProductCount() {
        return productCount;
    }

    public void setProductCount(Long productCount) {
        this.productCount = productCount;
    }

    public Long getOrdersPlacedCount() {
        return ordersPlacedCount;
    }

    public void setOrdersPlacedCount(Long ordersPlacedCount) {
        this.ordersPlacedCount = ordersPlacedCount;
    }

    public Long getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(Long customerCount) {
        this.customerCount = customerCount;
    }

    public Long getOrderDeliveredCount() {
        return orderDeliveredCount;
    }

    public void setOrderDeliveredCount(Long orderDeliveredCount) {
        this.orderDeliveredCount = orderDeliveredCount;
    }
}

