package com.svs.structural.compositePatternExample2;

class Company {
    public static void main(String[] args) {
        Employee developer1 = new Developer("Bad Man", 100, "Geek");
        Employee developer2 = new Developer("Code Junkie", 101, "Boffin");

        // engineering directory (composite)
        Manager engManager = new Manager("Mandela", 650000);
        engManager.addEmployee(developer1);
        engManager.addEmployee(developer2);

        Employee dev3 = new Developer("Jerry", 80, "Developer");

        // composite of composites
        Manager generalManager = new Manager("Sisiboy", 365000);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engManager);
        generalManager.showEmployeeDetails();
    }
}
