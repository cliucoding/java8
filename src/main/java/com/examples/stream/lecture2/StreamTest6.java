package com.examples.stream.lecture2;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Stream;

public class StreamTest6 {
  public static void main(String[] args) {

    // findFirst() returns an Optional object
    Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
    stream.findFirst()
          .ifPresent(System.out::println);
    System.out.println("----------");

    Stream.iterate(1, item -> item + 2)
          .limit(6)
          .forEach(System.out::println);
    System.out.println("----------");

    Stream<Integer> stream2 = Stream.iterate(1, item -> item + 2)
                                    .limit(6);
//        System.out.println(stream2.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).sum());

    stream2.filter(item -> item > 2)
           .mapToInt(item -> item * 2)
           .skip(2)
           .limit(2)
           .max()
           .ifPresent(System.out::println);
    System.out.println("----------");

    Stream<Integer> stream3 = Stream.iterate(1, item -> item + 2)
                                    .limit(6);
    IntSummaryStatistics summaryStatistics = stream3.filter(item -> item > 2)
                                                    .mapToInt(item -> item * 2)
                                                    .skip(2)
                                                    .limit(2)
                                                    .summaryStatistics();

    System.out.println(summaryStatistics.getMin());
    System.out.println(summaryStatistics.getCount());
    System.out.println(summaryStatistics.getMax());

    Stream<Integer> stream4 = Stream.iterate(1, item -> item + 2)
                                    .limit(6);
    System.out.println(stream4);

    // wrong
//        System.out.println(stream4.filter(item -> item > 2));
//        System.out.println(stream4.distinct()); // throw exception

    // correct
    Stream<Integer> stream5 = stream4.filter(item -> item > 2);
    System.out.println(stream5.distinct());


  }
}
