package com.chenjk.test.java8.extensionmethod;

/**
 * Created by chenjk on 2018/4/23.
 */
public interface Formula {
    double calculate(int a);
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
