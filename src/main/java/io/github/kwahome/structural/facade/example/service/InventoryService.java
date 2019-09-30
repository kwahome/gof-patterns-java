package io.github.kwahome.structural.facade.example.service;

import io.github.kwahome.structural.facade.example.domain.Product;

public class InventoryService {

    public static boolean isAvailable(final Product product) {
        /*Check Warehouse database for product availability*/
        return true;
    }
}
