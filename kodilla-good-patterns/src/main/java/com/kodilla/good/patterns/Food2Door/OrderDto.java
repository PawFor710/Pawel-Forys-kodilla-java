package com.kodilla.good.patterns.Food2Door;

public class OrderDto {

    private User user;
    private Product product;

    public OrderDto(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}
