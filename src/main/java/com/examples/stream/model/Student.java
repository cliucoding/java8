package com.examples.stream.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Student {
  String name;
  int score;
  int age;
}
