package com.examples.stream.lecture3;

import java.util.Arrays;
import java.util.List;

public class StreamTest7 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("hello", "world", "hello world");

//        list.stream().map(item -> item.substring(0, 1).toUpperCase() + item.substring(1)).
//                forEach(System.out::println);


    // lazy evaluation
    // It means that the filter is only applied during the terminal operation.
    list.stream()
        .map(item -> {
          String result = item.substring(0, 1)
                              .toUpperCase() + item.substring(1);
          System.out.println("test");
          return result;
        })
        .forEach(System.out::println);

    System.out.println("----------");

    list.forEach(System.out::println);
  }
}
