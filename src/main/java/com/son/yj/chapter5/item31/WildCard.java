package com.son.yj.chapter5.item31;

import java.util.Set;

public class WildCard {
    /**
     * 펙스 PECS - producer-extends, consumer-super
     * pushAll 같은 생산자가 주는 것은 < ? extends Number >
     * popAll 같은 소비자가 가져가는 것은 < ? super Integer> 와 깉은 ?
     * 나프탈린과 와들러는 이를 겟풋 원칙
     */


    public static <E> Set<E> union(Set<? extends E> set1, Set<? extends E> set2 ) {
//        return
        return null;
    }


}
