package io.github.kwahome.creational.prototype.example.performer;

import io.github.kwahome.creational.prototype.example.performer.enums.PerformerSkill;
import io.github.kwahome.creational.prototype.example.performer.enums.PerformerType;

public class Actor extends AbstractPerformer {

    public Actor() {
        this.skill = PerformerSkill.ACTING.name();
        this.type = PerformerType.ACTOR.name();
    }
}
