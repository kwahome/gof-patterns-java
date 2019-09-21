package io.github.kwahome.creational.prototype.example.performer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import io.github.kwahome.creational.prototype.example.performer.enums.PerformerType;

public class PerformerRegistry {

    private static Map<PerformerType, Performer> performers = new HashMap<>();

    static {
        performers.put(PerformerType.ACTOR, new Actor());
        performers.put(PerformerType.DANCER, new Dancer());
        performers.put(PerformerType.SINGER, new Singer());
    }

    public static Optional<Performer> getInstance(final PerformerType performerType) {
        Optional<Performer> optionalPerformer = Optional.empty();
        if (performers.containsKey(performerType)) {
            optionalPerformer = Optional.of((Performer) performers.get(performerType).clone());
        }
        return optionalPerformer;
    }
}
