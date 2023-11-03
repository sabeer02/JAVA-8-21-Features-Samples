package com.presentation.java.Twelve;

public class StringMethodsWorking {
    public static void main(String[] args) {
        String str = "Java 8 \nto \n9 \nPresentation!";
        System.out.println(str.indent(0));
        System.out.println(str.indent(3));

        String text = "Java";
        String transformed = text.transform(value -> new StringBuilder(value).reverse().toString());
        System.out.println(transformed);
    }
}
