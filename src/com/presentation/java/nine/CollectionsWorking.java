package com.presentation.java.nine;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CollectionsWorking {

    public static void iterateByKeysUsingLambda(Map<String, String> map) {
        map.keySet().forEach(k -> System.out.println((k + ":" + map.get(k))));
    }

    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three");
        Set<String> set = Set.of("one", "two", "three","abc");
        Map<String, String> map = Map.of("foo", "one", "bar", "two");

        iterateByKeysUsingLambda(map);

        Stream<String> stream = set.stream();
        stream.forEach(obj->System.out.print(obj+" "));


    }
}
