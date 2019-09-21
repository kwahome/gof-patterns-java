package io.github.kwahome.creational.prototype.example.performer;

public abstract class AbstractPerformer implements Performer {
    protected String skill;
    protected String type;

    @Override
    public String getSkill() {
        return this.skill;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void perform() {
        System.out.println(String.format("%s is %s", this.getType(), this.getSkill().toLowerCase()));
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
