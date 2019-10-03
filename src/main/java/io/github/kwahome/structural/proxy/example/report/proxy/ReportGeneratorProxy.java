package io.github.kwahome.structural.proxy.example.report.proxy;

import io.github.kwahome.structural.proxy.example.report.enums.AccessRole;
import io.github.kwahome.structural.proxy.example.report.enums.ReportFormat;
import io.github.kwahome.structural.proxy.example.report.role.Role;
import io.github.kwahome.structural.proxy.example.report.generator.ReportGenerator;
import io.github.kwahome.structural.proxy.example.report.generator.ReportGeneratorImpl;

public class ReportGeneratorProxy implements ReportGenerator {

    private ReportGenerator reportGenerator;
    private Role accessRole;

    public ReportGeneratorProxy(final Role accessRole) {
        this.accessRole = accessRole;
        this.reportGenerator = new ReportGeneratorImpl();
    }

    @Override
    public void displayReportTemplate(final ReportFormat reportFormat, final int reportEntries) {
        System.out.println(this.getClass().getSimpleName() + ": Displaying blank report template in "
            + reportFormat.value() + " format with" + reportEntries + " entries");

    }

    @Override
    public void generateComplexReport(final ReportFormat reportFormat, final int reportEntries) {
        this.reportGenerator.generateComplexReport(reportFormat, reportEntries);
    }

    @Override
    public void generateSensitiveReport() {
        if (this.accessRole.getRole().equals(AccessRole.MANAGER)) {
            reportGenerator.generateSensitiveReport();
        } else {
            System.out.println("You are not authorized to access sensitive reports.");
        }

    }
}
