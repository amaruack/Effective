package com.son.yj.chapter10.item43;

import java.util.*;

public class MethodReference {

    public static void main(String[] args) {

        // 람다보다 더 간결 !
        // 람다 보다는 우선 메서드 참조를 사용하라

        List<String> words = new ArrayList<>();

        // 최신 !! lambda 사용
        Collections.sort(words, (o1, o2) -> o1.compareTo(o2));

        // method reference 사용
        Collections.sort(words, String::compareTo);

        Map<String, Integer> map = new HashMap<>();

        map.put("test1", 1);
        map.put("test2", 1);

        String key = "test1";
//        map.merge(key, 1, (o1, o2) -> o1 + o2);
        map.merge(key, 1, Integer::sum);

        System.out.println("dsf");


    }

}
