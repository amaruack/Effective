package com.son.yj.chapter5.item28;

import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        /**
         * 배열 보다는 List를 사용하라
         * 하지만 꼭 List만을 사용하는것은 아니다 , 자바가 리스트를 기본 타입으로 제공하지 않으므로 ArrayList 같은 제네릭 타입도 결국은 기본 타입인 배열을 사용해 구현해야 한다.
         * 재네릭 배열을 만들지 못하게 막는 이유는 ? 타입 안전하지 않기 때문
         */

        Object[] test1 = new Long[1];
        test1[0] = "test"; // 런타임 오류

//        List<Object> test2 = new List<Long>(); // 컴파일 오류

    }
}
