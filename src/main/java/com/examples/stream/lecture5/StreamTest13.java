package com.examples.stream.lecture5;

import com.examples.stream.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
  public static void main(String[] args) {
    Student student1 = Student.builder()
                              .name("zhangsan")
                              .score(100)
                              .age(20)
                              .build();
    Student student2 = Student.builder()
                              .name("lisi")
                              .score(90)
                              .age(20)
                              .build();
    Student student3 = Student.builder()
                              .name("wangwu")
                              .score(90)
                              .age(30)
                              .build();
    Student student4 = Student.builder()
                              .name("zhangsan")
                              .score(80)
                              .age(40)
                              .build();

    List<Student> students = Arrays.asList(student1, student2, student3, student4);

    // select * from student group by name;
    Map<String, List<Student>> map1 = students.stream()
                                              .collect(Collectors.groupingBy(Student::getName));

    // select * from student group by score;
    Map<Integer, List<Student>> map2 = students.stream()
                                               .collect(Collectors.groupingBy(Student::getScore));

    // select name, count(*) from student group by name;
    Map<String, Long> map3 = students.stream()
                                     .collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

    Map<String, Double> map4 = students.stream()
                                       .collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));

    // partition true and false
    Map<Boolean, List<Student>> map5 = students.stream()
                                               .collect(Collectors.partitioningBy(student -> student.getScore() >= 90));

    System.out.println(map1);
    System.out.println(map2);
    System.out.println(map3);
    System.out.println(map4);
    System.out.println(map5);
  }
}
