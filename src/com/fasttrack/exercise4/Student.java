package com.fasttrack.exercise4;

public class Student {
    private int grade;
    private String name;

    static int sumOfTheGrades;
    static int numberOfStudents;

    public Student(int grade, String name) {
        this.grade = grade;
        this.name = name;
        numberOfStudents+=1;
        sumOfTheGrades+= grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    static double averageGrade(){
        return (double) sumOfTheGrades / (double) numberOfStudents;
    }
}
