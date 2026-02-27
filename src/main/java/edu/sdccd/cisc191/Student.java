package edu.sdccd.cisc191;

public class Student {

    private String name;
    private double gpa;
    private int id;

    public Student(String name, double gpa, int id) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty");
        }
        if (gpa < 0 || gpa > 4.0 ) {
            throw new IllegalArgumentException("Student gpa must be between 0 and 4.0");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("Student id must be positive");
        }

        this.name = name;
        this.gpa = gpa;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public double getGpa() {
        return gpa;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", gpa=" + gpa + ", id=" + id + "]";
    }
}
