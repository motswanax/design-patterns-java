package com.svs.structural.compositePatternExample2;

import java.util.ArrayList;
import java.util.List;

class Manager implements Employee {
    private List<Employee> employeeList = new ArrayList<>();
    private String name;
    private double salary;

    Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    private String getName() {
        return name;
    }

    private double getSalary() {
        return salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("-----------------");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("-----------------");

        for (Employee employee : employeeList) {
            employee.showEmployeeDetails();
        }
    }

    Employee getChild(int i) {
        return employeeList.get(i);
    }

    void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
