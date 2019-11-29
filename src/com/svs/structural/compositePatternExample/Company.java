package com.svs.structural.compositePatternExample;

public class Company {
    public static void main(String[] args) {
        Employee developer1 = new Developer("Bad Man", 100, "Geek");
        Employee developer2 = new Developer("Code Junkie", 101, "Boffin");

        // engineering directory (composite)
        Directory engDirectory = new Directory();
        engDirectory.addEmployee(developer1);
        engDirectory.addEmployee(developer2);

        Employee man1 = new Manager("Bill Gates", 50, "Boss");
        Employee man2 = new Manager("Elon Musk", 51, "Innovation Lead");

        // accounting directory (composite)
        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        // composite of composites
        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);

        companyDirectory.showEmployeeDetails();
    }
}
