package com.svs.structural.compositePatternExample2;

class Developer implements Employee {
    private String name;
    private long empId;
    private String position;

    Developer(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }
}
