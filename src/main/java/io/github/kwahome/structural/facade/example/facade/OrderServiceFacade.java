package io.github.kwahome.structural.facade.example.facade;

import io.github.kwahome.structural.facade.example.domain.Product;

public interface OrderServiceFacade {
    boolean placeOrder(final Product product);
}
