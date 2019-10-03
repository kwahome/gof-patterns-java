package io.github.kwahome.structural.proxy.example.report;

import io.github.kwahome.structural.proxy.example.report.enums.ReportFormat;
import io.github.kwahome.structural.proxy.example.report.generator.ReportGenerator;
import io.github.kwahome.structural.proxy.example.report.proxy.ReportGeneratorProxy;
import io.github.kwahome.structural.proxy.example.report.enums.AccessRole;
import io.github.kwahome.structural.proxy.example.report.role.Role;

public class Application {
    public static void main(String []args) {

        System.out.println("Report Generation Proxy:");
        System.out.println("------------------------");

        System.out.println("Manager Role:");
        System.out.println("-------------");
        ReportGenerator managerProxy = new ReportGeneratorProxy(new Role(AccessRole.MANAGER));
        managerProxy.displayReportTemplate(ReportFormat.PDF, 150);
        managerProxy.generateComplexReport(ReportFormat.PDF, 150);
        managerProxy.generateSensitiveReport();

        System.out.println("\n");

        System.out.println("User Role:");
        System.out.println("-------------");
        ReportGenerator userProxy = new ReportGeneratorProxy(new Role(AccessRole.USER));
        userProxy.displayReportTemplate(ReportFormat.PDF, 150);
        userProxy.generateComplexReport(ReportFormat.PDF, 150);
        userProxy.generateSensitiveReport();
        System.out.println("\n");

    }
}
