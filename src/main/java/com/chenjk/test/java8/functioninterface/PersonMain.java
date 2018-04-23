package com.chenjk.test.java8.functioninterface;

/**
 * Created by chenjk on 2018/4/23.
 */
public class PersonMain {
    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
    }
}
