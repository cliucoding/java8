package com.examples.stream.lecture4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest12 {
  public static void main(String[] args) {
    List<String> list1 = Arrays.asList("a1", "a2", "a3");
    List<String> list2 = Arrays.asList("b1", "b2", "b3", "b4");

    List<String> result = list1.stream()
                               .flatMap(item -> list2.stream()
                                                     .map(item2 -> item + " " + item2))
                               .collect(Collectors.toList());

    result.forEach(System.out::println);
  }

}
