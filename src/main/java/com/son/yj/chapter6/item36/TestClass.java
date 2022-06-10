package com.son.yj.chapter6.item36;

import java.util.EnumSet;

public class TestClass {

    public static void main(String[] args) {
        //
        final EnumSet<Style> set = EnumSet.of(Style.BOLD, Style.ITALIC);
        set.add(Style.UNDERLINE);


    }

}
