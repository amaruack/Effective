package com.son.yj.chapter5.item26;

import java.util.ArrayList;
import java.util.List;

public class RawType {

    public static void main(String[] args) {

        // 해당과 같이 raw 타입 사용 하지말것
        // 해당 raw 타입이 허용 되는 것은 기존 제네릭 이 만들어지기 전의 java 소스와의 호환 때문
        List list = new ArrayList<>();

        list.add(new Coin());

        // 모를 때는 차라리 물음표 사용 // wildcard 타입
        List<?> list2 = new ArrayList<>();

        // 예외
        // class 리터럴에는 raw 타입을 써야 한다.
        Class cl = List.class;
        Class cl2 = String[].class;
        Class cl3 = int.class;
        // 해당 내용 허용 안함
//        Class cl4 = List<String>.class ;

    }

    public static class Coin {

    }
}
