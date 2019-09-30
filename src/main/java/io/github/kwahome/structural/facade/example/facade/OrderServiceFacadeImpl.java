package io.github.kwahome.structural.facade.example.facade;

import io.github.kwahome.structural.facade.example.domain.Product;
import io.github.kwahome.structural.facade.example.service.InventoryService;
import io.github.kwahome.structural.facade.example.service.PaymentService;
import io.github.kwahome.structural.facade.example.service.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade {
    @Override
    public boolean placeOrder(final Product product) {
        boolean orderFulfilled = false;

        if (InventoryService.isAvailable(product)) {
            System.out.println("Product with id: '" + product.getProductId() + "' is available");
            boolean paymentConfirmed = PaymentService.makePayment();
            if (paymentConfirmed) {
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFulfilled = true;
            }
        }

        return orderFulfilled;
    }
}
