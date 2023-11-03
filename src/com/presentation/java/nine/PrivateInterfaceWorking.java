package com.presentation.java.nine;

public class PrivateInterfaceWorking implements PresentationInterface{

        public static void main(String... args) {
            PresentationInterface privateInterfaceWorking = new PrivateInterfaceWorking();
            PresentationInterface.aNormalMethod();
            //privateInterfaceWorking.privateMethod();
        }
    }
