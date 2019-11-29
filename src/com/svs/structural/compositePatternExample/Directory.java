package com.svs.structural.compositePatternExample;

import java.util.ArrayList;
import java.util.List;

class Directory implements Employee {
    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        for (Employee employee: employeeList) {
            employee.showEmployeeDetails();
        }
    }

    void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
