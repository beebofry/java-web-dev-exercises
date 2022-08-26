package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String courseName;
    private int credits;
    private ArrayList<String> roster;

    public Course(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
    }
    public String toString() {
        String courseReport = ("The name of this course is " + getCourseName() + " and is worth " + getCredits() + " credits");
        return courseReport;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseName, course.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
