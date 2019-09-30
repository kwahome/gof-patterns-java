package io.github.kwahome.structural.composite.example.catalog;

import java.util.ArrayList;

public class ProductCatalog extends CatalogComponent {

    private ArrayList<CatalogComponent> catalogComponents = new ArrayList<>();

    public ProductCatalog(final String name) {
        this.name = name;
    }

    @Override
    public void add(final CatalogComponent catalogComponent){
        catalogComponents.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent){
        catalogComponents.remove(catalogComponent);
    }

    @Override
    public void print(){
        for(CatalogComponent component : catalogComponents) {
            component.print();
        }
    }

}
