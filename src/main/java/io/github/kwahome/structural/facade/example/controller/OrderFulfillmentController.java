package io.github.kwahome.structural.facade.example.controller;

import io.github.kwahome.structural.facade.example.domain.Product;
import io.github.kwahome.structural.facade.example.facade.OrderServiceFacade;

public class OrderFulfillmentController {
    private OrderServiceFacade facade;

    public OrderFulfillmentController(final OrderServiceFacade facade) {
        this.facade = facade;
    }

    public void orderProduct(final Product product) {
        boolean orderFulfilled = facade.placeOrder(product);
        System.out.println("OrderFulfillmentController: Order completed with status 'success=" + orderFulfilled + "'");
    }
}
