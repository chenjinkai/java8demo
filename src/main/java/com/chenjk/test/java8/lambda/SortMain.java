package com.chenjk.test.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by chenjk on 2018/4/23.
 */
public class SortMain {

    private static List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    private static void shuffle(List<String> names) {
        Collections.shuffle(names);
        System.out.println("shuffled:" + names);
    }

    public static void main(String[] args) {
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
        System.out.println("sorted 1.:" + names);
        shuffle(names);
        Collections.sort(names, (String a, String b) -> b.compareTo(a));
        System.out.println("sorted 2.:" + names);
        shuffle(names);
        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println("sorted 3.:" + names);
    }
}
