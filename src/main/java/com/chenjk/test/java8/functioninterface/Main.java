package com.chenjk.test.java8.functioninterface;

/**
 * Created by chenjk on 2018/4/23.
 */
public class Main {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        System.out.println(converter.convert("123"));
    }
}
