package com.svs.structural.compositeAssignment;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        // technology dean and chairs under the dean
        Supervisor technologyDean = new Supervisor("Dr. Bad", "Dean of Technology");
        Supervisor chairOfMathDepartment = new Supervisor("Dr. Evil", "Chair of Maths Department");
        Supervisor chairOfComputerScience = new Supervisor("Dr. Code", "Chair of CS Department");

        // maths professors
        Professor mathsProf1 = new Professor("Prof. Archimedes", "Adjunct", 106);
        Professor mathsProf2 = new Professor("Prof. Newton", "Associate", 136);

        // cs professors
        Professor csProf1 = new Professor("Prof. Calculus", "Adjunct", 201);
        Professor csProf2 = new Professor("Prof. Good", "Associate", 256);
        Professor csProf3 = new Professor("Prof. Bad", "Associate", 246);

        technologyDean.addProfessor(chairOfMathDepartment);
        technologyDean.addProfessor(chairOfComputerScience);

        /* Professors of Mathematics directly report to chair of maths */
        chairOfMathDepartment.addProfessor(mathsProf1);
        chairOfMathDepartment.addProfessor(mathsProf2);

        /* Professors of CS directly report to chair of CS */
        chairOfComputerScience.addProfessor(csProf1);
        chairOfComputerScience.addProfessor(csProf2);
        chairOfComputerScience.addProfessor(csProf3);

        // Printing the details
        System.out.println("***COMPOSITE PATTERN DEMO***");
        System.out.println("\nThe college has the following structure\n");

        System.out.println(technologyDean.getDetails());
        List<Faculty> chairs = technologyDean.getMyFaculty();

        for (Faculty chair: chairs) {
            System.out.println("\t" + chair.getDetails());
        }

        List<Faculty> mathsProfessors = chairOfMathDepartment.getMyFaculty();
        for (Faculty professor: mathsProfessors) {
            System.out.println("\t\t" + professor.getDetails());
        }

        List<Faculty> csProfessors = chairOfComputerScience.getMyFaculty();
        for (Faculty professor: csProfessors) {
            System.out.println("\t\t" + professor.getDetails());
        }

        chairOfComputerScience.removeProfessor(csProf2);

        System.out.println("\nAfter " + csProf2.getPosition() + " Professor " + csProf2.getName() + " - office " +
                csProf2.getOfficeNum() + ", leaving the organisation, the CS department has the following faculty: ");
        csProfessors = chairOfComputerScience.getMyFaculty();
        for (Faculty professor: csProfessors) {
            System.out.println("\t\t" + professor.getDetails());
        }
    }
}
