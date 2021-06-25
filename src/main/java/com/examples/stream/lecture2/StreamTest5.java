package com.examples.stream.lecture2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest5 {
  public static void main(String[] args) {
    // convert to upper case for each element in the stream
    List<String> list = Arrays.asList("hello", "world", "helloworld", "test");
    list.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList())
        .forEach(System.out::println);

    System.out.println("----------");

    // the square of each element in the stream
    List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
    list2.stream()
         .map(item -> item * item)
         .collect(Collectors.toList())
         .forEach(System.out::println);

    System.out.println("----------");

    // // the square of each element in the lists in the stream
    Stream<List<Integer>> stream = Stream.of(Arrays.asList(1),
            Arrays.asList(2, 3), Arrays.asList(4, 5, 6));

    stream.flatMap(theList -> theList.stream())
          .map(item -> item * item)
          .forEach(System.out::println);

  }
}
