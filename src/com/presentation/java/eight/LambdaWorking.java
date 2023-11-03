package com.presentation.java.eight;

public class LambdaWorking {

    interface FuncInterface{

        void abstractWorking(int xyz);

        default void normalMethod(){
            System.out.println("I am a Normal Method inside a Interface Nothing special :-)");
        }

    }

    public static void main(String[] args) {

        // () parameter ---  -> expression  --- sout body
        FuncInterface FI = (int x) -> System.out.println(x*x);

        FI.abstractWorking(10);

        FI.normalMethod();
    }
}
