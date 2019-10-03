package io.github.kwahome.structural.proxy.example.report.generator;

import io.github.kwahome.structural.proxy.example.report.enums.ReportFormat;

public interface ReportGenerator {
    void displayReportTemplate(final ReportFormat reportFormat, final int reportEntries);
    void generateComplexReport(final ReportFormat reportFormat, final int reportEntries);
    void generateSensitiveReport();
}
