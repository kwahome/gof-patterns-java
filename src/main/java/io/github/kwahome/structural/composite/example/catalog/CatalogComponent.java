package io.github.kwahome.structural.composite.example.catalog;

/**
 * Composite.
 */
public abstract class CatalogComponent {
    protected String name;
    protected double price;

    /**
     * Composite method that adds {@link CatalogComponent} objects
     * @param catalogComponent {@link CatalogComponent}
     */
    public void add(final CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Cannot add item to catalog");
    }

    /**
     * Composite method that removes {@link CatalogComponent} objects
     * @param catalogComponent {@link CatalogComponent}
     */
    public void remove(final CatalogComponent catalogComponent) {

    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void print() {
        System.out.println("---------------------------------");
        System.out.println("Product Name: " + this.getName());
        System.out.println("Product Price: " + this.getPrice());
        System.out.println("---------------------------------");
    }
}
