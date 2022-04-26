package com.son.yj.chapter7.item46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamTest {
    public static void main(String[] args) throws FileNotFoundException {

        StreamTest.test3();

        BinaryOperator<Integer> binaryOperator = (n1, n2) -> n1 + n2;


    }

    // test1은 절대 스트림 코드라 부를 수 없다 !
    // forEach .. 연산은 스트림 계산 결과를 보고할 때만 사용하고, 계산하는 데는 쓰지 말자
    public static void test1() throws FileNotFoundException {
        File file = new File("src/main/resources/words.txt");
        Map<String, Long> freq = new HashMap<>();
        try (Stream<String> words = new Scanner(file).tokens())  {
            words.forEach(word ->{
                freq.merge(word.toLowerCase(), 1L, Long::sum);
            });
        }
    }

    // test2 는 스트림 코드라 부를 수 있다.
    public static void test2() throws FileNotFoundException {
        File file = new File("src/main/resources/words.txt");
        Map<String, Long> freq ;
        try (Stream<String> words = new Scanner(file).tokens())  {
            freq = words.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
        }
    }

    // 가장 흔한 단어 10개 추출
    public static void test3() throws FileNotFoundException {
        File file = new File("src/main/resources/words.txt");
        Map<String, Long> freq ;
        try (Stream<String> words = new Scanner(file).tokens())  {
            freq = words.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

            List<String> freq10words = freq.keySet().stream().sorted(Comparator.comparing(freq::get).reversed())
                    .limit(10)
                    .collect(Collectors.toList());

        }
    }


    public static <E> Iterable<E> iterableOf(Stream<E> stream) {
        return stream::iterator;
    }

    public static <E> Stream<E> streamOf(Iterable<E> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }

//    public Stream<String> tokens(Scanner scanner) {
//        Stream<String> stream = StreamSupport.stream(scanner.TokenSpliterator(), false);
//        return stream.onClose(this::close);
//    }



}
