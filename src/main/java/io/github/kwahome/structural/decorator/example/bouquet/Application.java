package io.github.kwahome.structural.decorator.example.bouquet;

import io.github.kwahome.structural.decorator.example.bouquet.decorator.Glitter;
import io.github.kwahome.structural.decorator.example.bouquet.decorator.PaperWrapper;
import io.github.kwahome.structural.decorator.example.bouquet.decorator.RibbonBow;

public class Application {
    public static void main(String []args) {
        System.out.println("Flower Bouquet:");
        System.out.println("---------------");
        System.out.println("\n");

        System.out.println("Rose Bouquet:");
        System.out.println("-------------");
        roseBouquet();
        System.out.println("\n");

        System.out.println("Decorated Rose Bouquet:");
        System.out.println("-----------------------");
        decoratedRoseBouquet();
        System.out.println("\n");

        System.out.println("Double Decorated Orchid Bouquet:");
        System.out.println("--------------------------------");
        doubleDecoratedOrchidBouquet();
        System.out.println("\n");

        System.out.println("\n");
    }

    private static void roseBouquet() {
        FlowerBouquet roseBouquet = new RoseBouquet();
        System.out.println("Description: " + roseBouquet.getDescription());
        System.out.println("Cost: " + roseBouquet.cost());
    }

    private static void decoratedRoseBouquet() {
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet = new RibbonBow(decoratedRoseBouquet);
        decoratedRoseBouquet = new Glitter(decoratedRoseBouquet);
        System.out.println("Description: " + decoratedRoseBouquet.getDescription());
        System.out.println("Cost: " + decoratedRoseBouquet.cost());
    }

    private static void doubleDecoratedOrchidBouquet() {
        FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new RibbonBow(decoratedOrchidBouquet);
        System.out.println("Description: " + decoratedOrchidBouquet.getDescription());
        System.out.println("Cost: " + decoratedOrchidBouquet.cost());
    }
}
