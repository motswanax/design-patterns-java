package com.svs.structural.compositeAssignment;

import java.util.ArrayList;
import java.util.List;

class Supervisor implements Faculty {
    String name;
    String deptName;
    List<Faculty> facultyList = new ArrayList<>();

    Supervisor(String name, String deptName) {
        this.name = name;
        this.deptName = deptName;
    }

    @Override
    public String getDetails() {
        return name + " is the " + deptName;
    }

    void addProfessor(Faculty professor) {
        facultyList.add(professor);
    }

    void removeProfessor(Faculty professor) {
        facultyList.remove(professor);
    }

    List getMyFaculty() {
        return facultyList;
    }
}
