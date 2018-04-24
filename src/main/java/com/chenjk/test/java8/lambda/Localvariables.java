package com.chenjk.test.java8.lambda;

import com.chenjk.test.java8.functioninterface.Converter;

/**
 * Created by chenjk on 2018/4/24.
 */
public class Localvariables {
    static int outerStaticNum;
    int outerNum;

    private void test2() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }

    private void test() {
        int num = 1;//effectively final
        Converter<Integer, String> stringConvert = (from) -> String.valueOf(from + num);
        String result = stringConvert.convert(2);
        System.out.println(result);
//        num = 3; 不能被赋值，因为num为隐式的final类型
    }

    public static void main(String[] args) {
        Localvariables localvariables = new Localvariables();
        localvariables.test();
    }
}
