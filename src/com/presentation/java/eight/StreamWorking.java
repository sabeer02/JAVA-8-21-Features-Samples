package com.presentation.java.eight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamWorking {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("England");
        countries.add("Germany");
        countries.add("France");
        countries.add("Finland");

       /* System.out.println("WITHOUT STREAMS");

        for(String country:countries)
        {
            System.out.println(country);
        }*/

        System.out.println("WITH STREAMS !!!");

        countries.forEach(System.out::println);
        //countries.forEach(System.out::println);

        /*countries
                .stream()
                .filter(t->t.startsWith("F"))
                .forEach(System.out::println);*/

        System.out.println("HOW SORT WORKS");

        countries
                .stream()
                .filter(name -> name.length() == 5)
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);



        List<String> filtereredList = new ArrayList<>();

        for (String country:countries) {
            if (country.length() == 5){
                filtereredList.add(country);
            }
        }

        Collections.sort(filtereredList);

        for (String country:filtereredList ) {
            System.out.println(country.toUpperCase());
        }
    }

}
