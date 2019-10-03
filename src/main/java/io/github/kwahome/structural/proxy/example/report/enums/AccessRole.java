package io.github.kwahome.structural.proxy.example.report.enums;

public enum AccessRole {
    MANAGER("Manager"),
    USER("User");

    private final String value;

    AccessRole(final String accessRole) {
        this.value = accessRole;
    }

    public String value() {
        return value;
    }
}
