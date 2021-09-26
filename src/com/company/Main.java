package com.company;

import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        Calculator cals = Calculator.instance.get();
        int a = cals.plus.apply(1,2);
        int b = cals.minus.apply(1, 1);
        int c = cals.devide.apply(8, 0); // есть вероятность деления на ноль

        cals.println.accept(c);
    }
}
