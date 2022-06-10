package com.son.yj.chapter8.item52;

import java.math.BigInteger;
import java.util.*;

/**
 * 다중정의 신중히 사용 !!!
 */
public class Item52 {



    public static String classify(Set<?> set) {
        return "set";
    }

    public static String classify(List<?> list) {
        return "list";
    }

    public static String classify(Collection<?> co) {
        return "co";
    }

    public static void main(String[] args) {

        Collection<?>[] ar = {
            new HashSet<Boolean>(),
            new ArrayList<BigInteger>(),
            new HashMap<String, String>().values(),
        };
        for (Collection co : ar) {
            System.out.println(classify(co));
        }

        List<Wine> list = List.of(new Wine(), new SparklingWine(), new Champagne());

        for (Wine wine : list) {
            System.out.println(wine.name());
        }

    }
    
    public static class Wine {
        String name() {
            return "포도주";
        }
    }
    public static class SparklingWine extends Wine {
        @Override
        String name() {
            return "스파클링와인";
        }
    }
    public static class Champagne extends SparklingWine {
        @Override
        String name() {
            return "샴페인";
        }
    }
    

}
