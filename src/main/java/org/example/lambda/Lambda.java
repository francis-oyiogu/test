package org.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> integers = List.of(13,2,35,14);
//        for (int i = 0; i < integers.size(); i++) {
//            int one = integers.get(i);
//            if (one % 2 == 0){
////                System.out.println(integers.get(i));
//            }
//        }
        integers.stream().filter(i -> (i % 2 == 0)).forEach(System.out::println);
//        integers.stream().filter(i -> (i % 2 == 0)).forEach(x -> System.out.println(x));

//        --------------

        List<Integer> addResults = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            int one = integers.get(i);
            if (one % 2 == 0){
                addResults.add(one + 1);
            }
        }
//        System.out.println(addResults);


//        --------

        addResults = integers.stream().filter(i -> (i % 2 == 0)).map(i -> i + 1).collect(Collectors.toList());
        System.out.println(addResults);
    }
}
