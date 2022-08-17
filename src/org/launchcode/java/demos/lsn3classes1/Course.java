package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int credits;
    private ArrayList<String> roster;

    public Course(String courseName, int credits, ArrayList roster) {
        this.courseName = courseName;
        this.credits = credits;
        this.roster = roster;
    }
}
