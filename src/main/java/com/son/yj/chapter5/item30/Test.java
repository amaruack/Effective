package com.son.yj.chapter5.item30;

import java.util.function.UnaryOperator;

public class Test {

    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    public static <T> UnaryOperator<T> identifyFunction(){
        return (UnaryOperator<T>) IDENTITY_FN;
    }

    public static void main(String[] args) {
        String[] strings = {"test1", "test2", "test3"};
        UnaryOperator<String> sameString = identifyFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }
        Number[] numbers = {1,2,3};
        UnaryOperator<Number> sameNumber = identifyFunction();
        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }
    }

}
