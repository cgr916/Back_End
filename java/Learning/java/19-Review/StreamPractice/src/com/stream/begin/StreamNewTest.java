package com.stream.begin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: cgr
 * @date: 2022/11/12 - 21:15
 */
public class StreamNewTest {

    @Test
    public void test(){
        // Collection 的 Stream
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Stream<Integer> stream1 = list.stream();

        // 数组 的 Stream
        IntStream stream2 = Arrays.stream(new int[]{1, 2, 3});

        // Stream 的 静态方法创造
        Stream<ArrayList<Integer>> list1 = Stream.of(list);
    }
}
