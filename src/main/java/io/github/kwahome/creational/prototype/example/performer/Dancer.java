package io.github.kwahome.creational.prototype.example.performer;

import io.github.kwahome.creational.prototype.example.performer.enums.PerformerSkill;
import io.github.kwahome.creational.prototype.example.performer.enums.PerformerType;

public class Dancer extends AbstractPerformer {

    public Dancer() {
        this.skill = PerformerSkill.DANCING.name();
        this.type = PerformerType.DANCER.name();
    }
}
