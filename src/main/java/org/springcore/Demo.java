package org.springcore;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(3, 4, 5, 9, 2, 6, 5, 3, 5);
//
//        Optional<Integer> minNumber = numbers.stream()
//                .max(Comparator.naturalOrder());
//
//        if (minNumber.isPresent()) {
//            System.out.println("Minimum number: " + minNumber.get());
//        } else {
//            System.out.println("The stream is empty.");
//        }

//        Sum s = new Sum() {
//            @Override
//            public void sumNum(int a, int b) {
//                System.out.println(a+b);
//            }
//        };
//        s.sumNum(4,44);
//
//        Sum s1 = (a,b) -> {
//            System.out.println(a-b);
//        };
//        s1.sumNum(7,7);

        // Stream API
        List<Integer> l1 = Arrays.asList(3,1,2,2,3);

        Integer i = l1.stream().findAny().filter(s-> s%2 == 0).orElse(0);

        System.out.println(i);


    }
}
