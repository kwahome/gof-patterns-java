package io.github.kwahome.structural.proxy.example.report.enums;

public enum ReportFormat {
    PDF("PDF");

    private final String value;

    ReportFormat(final String reportFormat) {
        this.value = reportFormat;
    }

    public String value() {
        return value;
    }
}
