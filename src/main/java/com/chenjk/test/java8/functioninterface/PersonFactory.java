package com.chenjk.test.java8.functioninterface;

/**
 * Created by chenjk on 2018/4/23.
 */
public interface PersonFactory<P> {
    P create(String firstName, String lastName);
}
