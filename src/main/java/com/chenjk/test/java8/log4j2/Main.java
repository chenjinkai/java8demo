package com.chenjk.test.java8.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by chenjk on 2018/4/23.
 */
public class Main {
    private static final Logger HELLO_LOGGER = LoggerFactory.getLogger("HelloWorld");

    public static void main(String[] args) {
        HELLO_LOGGER.info("test output");
    }
}
