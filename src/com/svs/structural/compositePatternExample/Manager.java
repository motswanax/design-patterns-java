package com.svs.structural.compositePatternExample;

class Manager implements Employee {
    private String name;
    private long empId;
    private String position;

    Manager(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}
