package com.presentation.java.sixteen;

public class RecordWorking {

    public static void main(String[] args) {
        StudentRecord student = new StudentRecord (1, "Sabeer", "AMS", "Student Intern", 21);
        System.out.println(student.id());
        System.out.println(student.name());
        System.out.println(student);
    }
}

record StudentRecord(int id,
                     String name,
                     String dept,
                     String role,
                     int age){}

