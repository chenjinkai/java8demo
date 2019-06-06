package com.chenjk.test.java8;

import java.util.function.Supplier;

/**
 * Created by chenjk on 2018/5/14.
 */
public class SuppliersMain {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> String.valueOf(1 + 1);
        stringSupplier.get();
    }
}
