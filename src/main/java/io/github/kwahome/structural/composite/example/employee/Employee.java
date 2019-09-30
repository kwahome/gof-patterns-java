package io.github.kwahome.structural.composite.example.employee;

public interface Employee {

    public void add(final Employee employee);
    public void remove(final Employee employee);
    public Employee getChild(int index);
    public String getName();
    public double getSalary();
    public void print();
}
