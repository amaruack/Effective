package com.son.yj.chapter10.item44;

import java.util.function.IntFunction;
import java.util.function.LongToIntFunction;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        IntFunction func = o1 -> String.valueOf(o1);

        String tmp = (String)func.apply(124);

        LongToIntFunction longToIntFunction = o1 -> (int)o1 ;

        int re = longToIntFunction.applyAsInt(124L);

        TestFunction testFunction = o1 -> Integer.parseInt(o1) + 2;
        int re22 = testFunction.testApply("124");
        System.out.println("asdfasdf");

        // 왠만하면 표준 함수형 인터페이스 활용
        // 직접 만들려면 인터페이스에는 항상 FunctionalInterface 사용

        

    }

    @FunctionalInterface
    private interface TestFunction {
        int testApply(String value);
    }

}
