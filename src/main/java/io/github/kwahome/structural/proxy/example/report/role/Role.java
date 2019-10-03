package io.github.kwahome.structural.proxy.example.report.role;

import io.github.kwahome.structural.proxy.example.report.enums.AccessRole;

public class Role {

    private final AccessRole role;

    public Role(final AccessRole role) {
        this.role = role;
    }

    public AccessRole getRole() {
        return role;
    }
}
