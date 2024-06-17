package AJD.lab12;

import java.time.LocalDate;

public class ex1 {
    public static LocalDate getProgrammerDay(int year) {
        return LocalDate.of(year, 1, 1).withDayOfYear(256);
    }

    public static void main(String[] args) {
        System.out.println(getProgrammerDay(2023)); // 13 września 2023 (rok nieprzestępny)
        System.out.println(getProgrammerDay(2024)); // 12 września 2024 (rok przestępny)
    }
}
