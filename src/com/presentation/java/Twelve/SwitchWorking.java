package com.presentation.java.Twelve;

public class SwitchWorking {

    private static String EnhancedSwitchStatement(int number) {
        String result = "";
        switch (number) {
            case 1, 2:
                result = "one or two";
                break;
            case 3:
                result = "three";
                break;
            case 4, 5, 6:
                result = "four or five or six";
                break;
            default:
                result = "unknown";
        };
        return result;
    }

    private static String TraditionalSwitchStatement(int number) {
        String result = "";
        switch (number) {
            case 1:
            case 2:
                result = "one or two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
            case 5:
            case 6:
                result = "four or five or six";
                break;
            default:
                result = "unknown";
        };
        return result;
    }

    public static void main(String[] args) {

        System.out.println(EnhancedSwitchStatement(2));
        System.out.println(TraditionalSwitchStatement((1)));
    }
}
