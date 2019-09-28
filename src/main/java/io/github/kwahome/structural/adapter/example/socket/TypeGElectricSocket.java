package io.github.kwahome.structural.adapter.example.socket;

import io.github.kwahome.structural.adapter.example.plug.TypeGSocketPlug;

public class TypeGElectricSocket {

    public void plugIn(final TypeGSocketPlug socketPlug) {
       socketPlug.giveElectricity();
    }
}
