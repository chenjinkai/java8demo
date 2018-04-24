package com.chenjk.test.java8.functioninterface;

import java.util.function.Function;

/**
 * Created by chenjk on 2018/4/24.
 */
public class FunctionMain {
    public static void main(String[] args) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        backToString.apply("123");
    }
}
