package com.presentation.java.seventeen;



public class PatternMatching {

    public static void main(String[] args) {
        Object obj = false;

        switch (obj) {
            case String s -> System.out.println("It's a String");
            case Integer i -> System.out.println("It's an Integer");
            case Double d -> System.out.println("It's a Double");
            default -> System.out.println("I don't know what it is");
        }
    }


}
