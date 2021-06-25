package com.examples.joda;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class JodaTest3 {
  public static void main(String[] args) {
    LocalDate startLocalDate = LocalDate.of(2020, 3, 12);
    LocalDate endLocalDate = LocalDate.of(2020, 7, 20);

    Period periodBetween = Period.between(startLocalDate, endLocalDate);
    System.out.println(periodBetween);  // P4M8D - 4 months and 8 days

    System.out.println(periodBetween.getDays());        //8
    System.out.println(periodBetween.getMonths());      //4
    System.out.println(periodBetween.getYears());       //0

    System.out.println(periodBetween.get(ChronoUnit.DAYS)); //8
  }
}
