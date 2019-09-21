package io.github.kwahome.creational.prototype;

import java.util.ArrayList;

import io.github.kwahome.creational.prototype.example.performer.Performer;
import io.github.kwahome.creational.prototype.example.performer.PerformerRegistry;
import io.github.kwahome.creational.prototype.example.performer.enums.PerformerType;

public class Application {
    public static void main(String []args) {
        System.out.println("Performers:");
        System.out.println("-----------");

        ArrayList<PerformerType> performerTypes = new ArrayList<>();
        performerTypes.add(PerformerType.ACTOR);
        performerTypes.add(PerformerType.DANCER);
        performerTypes.add(PerformerType.SINGER);

        for(PerformerType performerType: performerTypes) {
            PerformerRegistry.getInstance(performerType).ifPresentOrElse(
                Performer::perform,
                () -> System.out.println(String.format("Performer of type '%s' does not exist", performerType)));
        }
        System.out.println("\n");
    }
}
