package com.company.kyu7;

import java.util.function.Function;

/*
    Condition: https://www.codewars.com/kata/java-functional-programming-part-1-the-beginning/java
 */

public class FunctionalProgramming1 {
    public static Function<Student, Boolean> f = (student)->{ return student.getFullName().equals("John Smith") && student.studentNumber.equals("js123"); };//Make me a function; remember to set the types!
}

class Student {
    private final String firstName;
    private final String lastName;
    public final String studentNumber;

    public Student(String firstName,String lastName,String studentNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.studentNumber=studentNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getCommaName() {
        return lastName + ", " + firstName;
    }
}
