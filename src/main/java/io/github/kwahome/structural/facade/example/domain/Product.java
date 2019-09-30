package io.github.kwahome.structural.facade.example.domain;

public class Product {
    private int productId;
    private String name;

    public Product(final int productId, final String name){
        this.productId = productId;
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
