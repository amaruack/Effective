package com.son.yj.chapter10.item47;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.son.yj.chapter10.item47.StreamIteratorConverter.iterableOf;
import static com.son.yj.chapter10.item47.StreamIteratorConverter.streamOf;

public class Test01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

//        for ( String st : list.stream()){
//        for ( String st :  iterableOf(list.stream())){
//        }

        int index = 2;

        System.out.println(index >>= 1);
        System.out.println(index);
        int index2 = 1;
        System.out.println(index >>= 1);


        List<Integer> origin = Arrays.stream(new int[]{
//                0,1,2,3/*,4,5,6,7,8,9,*/
                2,3,4/*,4,5,6,7,8,9,*/
//                10,11,12,13,14,15,16,17,18,19,
//                20,21,22,23,24,25,26,27,28,29
//                30,31,32,33,34,35,36,37,38,39
        }).boxed().collect(Collectors.toList());

        Set<Integer> set = new HashSet<>(origin);

        Collection<Set<Integer>> co = PowerSet.of(set);

        List<List<Integer>> tmpsub =  SubLists.of(origin).collect(Collectors.toList());
        List<List<Integer>> tmpsub2 =  SubLists.of2(origin).collect(Collectors.toList());

        System.out.println("sdf");
    }

}
