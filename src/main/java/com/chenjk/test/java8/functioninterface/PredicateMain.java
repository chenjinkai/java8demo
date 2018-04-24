package com.chenjk.test.java8.functioninterface;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by chenjk on 2018/4/24.
 */
public class PredicateMain {

    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> (s.length() > 0);
        predicate.test("foo");
        predicate.negate().test("foo");

        Predicate noNull = Objects::nonNull;
        Predicate isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

    }
}
