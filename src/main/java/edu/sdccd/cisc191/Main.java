package edu.sdccd.cisc191;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // TODO create students

        List<Student> students = new ArrayList<>();

        students.add(new Student("Karina", 4.0, 1));
        students.add(new Student("Giselle", 3.3, 2));
        students.add(new Student("Winter", 3.9, 3));
        students.add(new Student("Vivian", 3.2, 4));


        // TODO demonstrate filtering

        List<Student> highGpa = StudentAnalyzer.filter(
                students,
                s -> s.getGpa() > 3.0
        );

        System.out.println("High GPA Students:");
        highGpa.forEach(System.out::println);

        // TODO demonstrate sorting

                StudentAnalyzer.sort(
                        students,
                        (s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa())
                );

        System.out.println("\nSorted by GPA (Descending):");
        students.forEach(System.out::println);

        // TODO print average GPA

        double avg = StudentAnalyzer.averageGpa(students);
        System.out.println("\nAverage GPA: " + avg);

    }
}