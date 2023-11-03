package com.presentation.java.nine;

public interface PresentationInterface {

        static void aNormalMethod() {
            System.out.print("Hello");
            privateMethod();
        }

        static private void privateMethod() {
            System.out.println(" world!");
        }
}
