package io.github.kwahome.structural.composite.example.employee;

/**
 * This class is leaf node so all operations related to accessing children will be empty as it has no children.
 */
public class Developer implements Employee {
    private String name;
    private double salary;

    public Developer(final String name, final double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(final Employee employee) {
        //this is leaf node so this method is not applicable to this class.
    }

    @Override
    public void remove(final Employee employee) {
        //this is leaf node so this method is not applicable to this class.
    }

    @Override
    public Employee getChild(int index) {
        //this is leaf node so this method is not applicable to this class.
        return null;
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
    }
}
