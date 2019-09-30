package io.github.kwahome.structural.composite.example.employee;

public class Application {
    public static void main(String []args) {
        System.out.println("Employee Composite:");
        System.out.println("-------------------");
        System.out.println("\n");
        Employee employeeJohn = new Developer("John", 10000);
        Employee employeeDavid = new Developer("David", 15000);

        Employee managerDaniel = new Developer("Daniel", 25000);
        managerDaniel.add(employeeJohn);
        managerDaniel.add(employeeDavid);

        Employee employeeMichael = new Developer("Micheal", 20000);
        Manager generalManager = new Manager("Mark", 50000);
        generalManager.add(employeeMichael);
        generalManager.add(managerDaniel);

        generalManager.print();

        System.out.println("\n");
    }
}
