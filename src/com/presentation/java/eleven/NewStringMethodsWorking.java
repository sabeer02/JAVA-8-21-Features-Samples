package com.presentation.java.eleven;

import java.util.List;

public class NewStringMethodsWorking {
    public static void main(String[] args){
        String multilineString = "JAVA 8 \n \n to \n JAVA 21.";

//        System.out.println(multilineString);

        // java 8
        // to
        // java 21
        //

        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .toList();

        lines.forEach(System.out::println);
    }
}
