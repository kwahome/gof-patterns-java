package io.github.kwahome.structural.composite.example.employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite.
 *
 * Key point here is that all common method delegates its operations to child objects.It has method to access and
 * modify its children.
 */
public class Manager implements Employee {
    private String name;
    private double salary;
    private List<Employee> employees = new ArrayList<>();

    public Manager(final String name, final double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(final Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public void remove(final Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public Employee getChild(final int index) {
        return this.employees.get(index);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void print() {
        System.out.println("---------------------------");
        System.out.println("Name: " + this.getName());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("---------------------------");

        for (Employee employee : this.employees) {
            employee.print();
        }
    }
}
