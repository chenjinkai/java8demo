package com.chenjk.test.java8.extensionmethod;

/**
 * Created by chenjk on 2018/4/23.
 */
public class Main {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(16));
//        Formula formula2 = (a) -> sqrt(a * 100); //不能被调用
    }
}
