package com.examples.joda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class JodaTest2 {
  public static void main(String[] args) {
    // convert String to LocalDate
    // Default pattern is yyyy-MM-dd
    LocalDate today = LocalDate.parse("2019-03-29");
    System.out.println(today);

    System.out.println("---------------------------");

    LocalDate date = LocalDate.parse("20210726", DateTimeFormatter.BASIC_ISO_DATE);
    System.out.println(date);

    System.out.println("---------------------------");

    try {
      LocalDate.parse("2021072", DateTimeFormatter.BASIC_ISO_DATE);
    } catch (DateTimeParseException exception) {
      System.out.println(exception.getMessage());
    }
  }
}
