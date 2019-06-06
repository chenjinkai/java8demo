package com.chenjk.test.java8;

import com.chenjk.test.java8.functioninterface.Person;

import java.util.function.Consumer;

/**
 * Created by chenjk on 2018/5/14.
 */
public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p);
        greeter.accept(new Person("Luke", "Skywalker"));
    }
}
