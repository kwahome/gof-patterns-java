package io.github.kwahome.structural.adapter.example.adapter;

import io.github.kwahome.structural.adapter.example.plug.TypeFSocketPlug;
import io.github.kwahome.structural.adapter.example.plug.TypeGSocketPlug;

public class TypeFToGAdapter implements TypeGSocketPlug {
    private TypeFSocketPlug socketPlug;

    public TypeFToGAdapter(final TypeFSocketPlug socketPlug) {
        this.socketPlug = socketPlug;
    }

    @Override
    public void giveElectricity() {
        System.out.println("Type F to Type G adapter");
        this.socketPlug.giveElectricity();
    }
}
