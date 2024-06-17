package AJD.lab12;

import java.time.LocalDate;

public class ex2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2000, 2, 29);
        System.out.println("Original date: " + date);
        LocalDate datePlusOneYear = date.plusYears(1);
        System.out.println("After adding one year: " + datePlusOneYear);
        for (int i = 1; i <= 3; i++) {
            datePlusOneYear = datePlusOneYear.plusYears(1);
            if (datePlusOneYear.getMonthValue() == 2 && datePlusOneYear.getDayOfMonth() == 28
                    && datePlusOneYear.isLeapYear()) {
                datePlusOneYear = datePlusOneYear.plusDays(1);
            }

            System.out.println("After adding " + (i + 1) + " years: " + datePlusOneYear);
        }
    }
}
