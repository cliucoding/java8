package com.examples.stream.lecture2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {
  public static void main(String[] args) {

    // convert a stream to array
    Stream<String> stream1 = Stream.of("hello", "world", "helloworld");

//        String[] stringArray = stream.toArray(length -> new String[length]);

    String[] stringArray = stream1.toArray(String[]::new);
    Arrays.asList(stringArray)
          .forEach(System.out::println);
    System.out.println("-----");


    // convert stream to arraylist
    Stream<String> stream2 = Stream.of("hello", "world", "helloworld");
//        List<String> list = stream2.collect(Collectors.toList());
    List<String> list = stream2.collect(
            () -> new ArrayList(),
            (theList, item) -> theList.add(item),
            (theList1, theList2) -> theList1.addAll(theList2)
    );
//        List<String> list = stream2.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);

    list.forEach(System.out::println);
    System.out.println("-----");

    // another way to convert stream to list
    Stream<String> stream3 = Stream.of("hello", "world", "helloworld");
    List<String> list2 = stream3.collect(Collectors.toCollection(ArrayList::new));
    list2.forEach(System.out::println);
    System.out.println("-----");

    // convert stream to set
    Stream<String> stream4 = Stream.of("hello", "world", "helloworld");
    Set<String> set = stream4.collect(Collectors.toCollection(TreeSet::new));
    System.out.println(set.getClass());

    set.forEach(System.out::println);
    System.out.println("-----");

    // concatenate string from stream
    Stream<String> stream = Stream.of("hello", "world", "helloworld");
    String str = stream.collect(Collectors.joining())
                       .toString();
    System.out.println(str);


  }
}
