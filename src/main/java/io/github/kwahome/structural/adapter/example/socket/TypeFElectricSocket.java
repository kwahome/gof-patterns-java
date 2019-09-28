package io.github.kwahome.structural.adapter.example.socket;

import io.github.kwahome.structural.adapter.example.plug.TypeFSocketPlug;

public class TypeFElectricSocket {

    public void plugIn(final TypeFSocketPlug socketPlug) {
        socketPlug.giveElectricity();
    }
}
