package io.github.kwahome.creational.prototype.example.performer;

import io.github.kwahome.creational.prototype.example.performer.enums.PerformerSkill;
import io.github.kwahome.creational.prototype.example.performer.enums.PerformerType;

public class Singer extends AbstractPerformer {

    public Singer() {
        this.skill = PerformerSkill.SINGING.name();
        this.type = PerformerType.SINGER.name();
    }
}
