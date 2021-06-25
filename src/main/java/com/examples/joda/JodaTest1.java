package com.examples.joda;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class JodaTest1 {
  public static void main(String[] args) {
    // convert LocalDate to String
    String timeKolkata = LocalDate.now(ZoneId.of("America/New_York"))
                                  .format(DateTimeFormatter.BASIC_ISO_DATE);
    System.out.println("Current Date in EST = " + timeKolkata);
  }
}
