package io.github.kwahome.structural.proxy.example.report.generator;

import io.github.kwahome.structural.proxy.example.report.enums.ReportFormat;

public class ReportGeneratorImpl implements ReportGenerator {

    public ReportGeneratorImpl() {
        System.out.println(this.getClass().getSimpleName() + ": instance created");
    }

    @Override
    public void displayReportTemplate(final ReportFormat reportFormat, final int reportEntries) {
        System.out.println(this.getClass().getSimpleName() + ": Displaying report template " + reportFormat.value()
            + "format with " + reportEntries + " entries");
    }

    @Override
    public void generateComplexReport(final ReportFormat reportFormat, final int reportEntries) {
        System.out.println(this.getClass().getSimpleName() + ": Generating complex report in " + reportFormat.value()
            + "format with " + reportEntries + " entries");

    }

    @Override
    public void generateSensitiveReport() {
        System.out.println(this.getClass().getSimpleName() + ": Generating sensitive report");
    }
}
