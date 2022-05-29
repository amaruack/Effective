package com.son.yj.chapter10.item47;

import java.util.*;

public class PowerSet {

    public static final <E> Collection<Set<E>> of(Set<E> s) {
        List<E> src = new ArrayList<>(s);
//        if(src.size() > 30) {
//            throw new IllegalArgumentException("집합의 개수 최대 30개");
//        }
        return new AbstractList<Set<E>>() {

            @Override
            public int size() {
                return 1 << src.size();
            }

            @Override
            public Set<E> get(int index) {
                Set<E> result = new HashSet<>();
//                for (int i = 0; index != 0 ; i++, index >>= 1) {
//                    if ((index & 1) == 1) {
//                        result.add(src.get(i));
//                    }
//                }
                for (int i = 0; i < src.size() ; i++) {
                    if ((index & 1 << i) != 0) {
                        result.add(src.get(i));
                    }
                }
                return result;
            }
        };
    }

}
