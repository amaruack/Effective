package com.son.yj.chapter10.item47;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface StreamIteratorConverter {

    static <E> Iterable<E> iterableOf(Stream<E> stream) {
        return stream::iterator;
    }

    static <E> Stream<E>  streamOf(Iterable<E> iterator) {
        return StreamSupport.stream(iterator.spliterator(), false);
    }
}
