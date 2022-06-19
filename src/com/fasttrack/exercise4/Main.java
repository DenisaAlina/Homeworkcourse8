package com.fasttrack.exercise4;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(10, "Alin");
        Student student2 = new Student(8, "Alina");
        Student student3 = new Student(9, "Adina");
        Student student4 = new Student(7, "Denisa");
        System.out.println(Student.averageGrade());
    }
}
