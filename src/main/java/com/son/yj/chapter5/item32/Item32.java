package com.son.yj.chapter5.item32;

import java.util.List;

public class Item32 {

    public static void main(String[] args) {
        testMethod2(List.of("string1"));
    }

    public static void testMethod(String... args){
        String tmp = args[1];
    }

    public static void testMethod2(List<String>... stringLists){
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList;
        String s = stringLists[0].get(0);
        System.out.println("sdf");
    }

}
