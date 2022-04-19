package com.son.yj.chapter10.item42;

import java.util.*;

public class Lambda {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        // 낡은 기법 !! // 익명 클래스 사용
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        // 최신 !! lambda 사용
        // 제네릭에서 해당 객체에 대한 정보를 뽑아옴 !!!
        Collections.sort(words, (o1, o2) -> o1.compareTo(o2));

        // 람다는 이름이 없고 문서화도 못 한다.
        // 따라서 고드 자체로 동작이 명확히 설명되지 않거나 코드 줄 수가 많아지면 람다를 쓰지 말아 야 한다.
        // 람다에서 this 키워드는 바깥 인스터스를 가르킴, 익명클래스는 자기 자신 가르킴

    }

}
