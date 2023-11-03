package com.presentation.java.thirteen;

public class MultilineStrings {
    public static void main(String[] args) {
        String JSON_STRING
                = "{\r\n" + "\"name\" : \"Sabeer\",\r\n" + "\"website\" : \"https://www.%s.com/\"\r\n" + "}";

        String TEXT_BLOCK_JSON = """
            {
                "name" : “Sabeer",
                "website" : "https://www.%s.com/"
            }
        """;

        System.out.println(JSON_STRING);
        System.out.println(TEXT_BLOCK_JSON);


    }
}
