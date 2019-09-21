package io.github.kwahome.creational.prototype.example.performer;

public interface Performer extends Cloneable {
    String getSkill();
    String getType();
    void perform();
    Object clone();
}
