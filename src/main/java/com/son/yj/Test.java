package com.son.yj;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
//        int[] A = new int[]{1, 3, 6, 4, 1, 2};
        int[] A = new int[]{1, 3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int result = 1;
        // write your code in Java SE 8
        List<Integer> list = Arrays.stream(A).distinct().filter(i -> i >0).sorted().boxed().collect(Collectors.toList());

        for (int i = 0; i < list.size() ; i++) {
            if (result != list.get(i) ){
                break;
            }
            result++;
        }

        return result;
    }
}
