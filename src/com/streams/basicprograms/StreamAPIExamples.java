package com.streams.basicprograms;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;

public class StreamAPIExamples {

    public static void main(String[] args) {
        /**
         * Intermediate Operations:
         * 1. filter
         * 2. map
         * 3. flatmap
         * 4. distinct
         * 5. peek
         * 6. skip
         * 7. limit
         * 8. sorted
         */

        /***
         * Terminal Operations:
         * 1. collect
         * 2. forEach
         * 3. count
         * 4. reduce
         * 5. findAny
         * 6. findFirst
         * 7. allMatch
         * 8. noneMatch
         * 9. anyMatch
         * 10. max and min
         */


        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Richard");
        names.add("Carla");
        names.add("Richard");
        names.add("Bob");

        //filter
        List<String> namesThatStartWithB = names.stream().filter( e -> e.startsWith("B")).collect(Collectors.toList());
        System.out.println(namesThatStartWithB);

        // get all names with length > 4
        List<String> namesWithLength = names.stream().filter(e-> e.length()>4).collect(Collectors.toList());
        System.out.println(namesWithLength);

        // get all names that contains letter 'o'
        Set<String> namesContainsLettero =  names.stream().filter(e->e.contains("o")).collect(Collectors.toSet());
        System.out.println(namesContainsLettero);

        //map
        System.out.println(names.stream().map( e-> e.toLowerCase()).collect(Collectors.toSet()));
        System.out.println(names.stream().map( e -> e.length()).collect(Collectors.toList()));

        //1. convert all names to upper case
        System.out.println(names.stream().map(e->e.toUpperCase()).collect(Collectors.toList()));

        //2. get all first characters
        System.out.println(names.stream().map(e->e.charAt(0)).collect(Collectors.toList()));

        //Distinct
        //get unique names list
        System.out.println(names.stream().distinct().collect(Collectors.toList()));

        //sorted
        System.out.println(names.stream().distinct().sorted().collect(Collectors.toList()));

        System.out.println(names.stream().collect(Collectors.toMap( e-> e, e -> e.length(), (o, n) -> n)));

    }
}
