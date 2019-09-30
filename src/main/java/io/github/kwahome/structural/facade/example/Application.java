package io.github.kwahome.structural.facade.example;

import io.github.kwahome.structural.facade.example.controller.OrderFulfillmentController;
import io.github.kwahome.structural.facade.example.domain.Product;
import io.github.kwahome.structural.facade.example.facade.OrderServiceFacadeImpl;

public class Application {
    public static void main(String []args) {

        System.out.println("Order Fulfillment Facade:");
        System.out.println("-------------------------");
        Product product = new Product(1, "Test Product");
        OrderFulfillmentController controller = new OrderFulfillmentController(new OrderServiceFacadeImpl());
        controller.orderProduct(product);
        System.out.println("\n");

    }
}
