package com.chenjk.test.java8.functioninterface;

/**
 * Created by chenjk on 2018/4/23.
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
