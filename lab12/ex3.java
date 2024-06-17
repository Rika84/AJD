package AJD.lab12;

import java.time.LocalDate;
import java.util.function.Predicate;

public class ex3 {
    public static LocalDate next(LocalDate date, Predicate<LocalDate> predicate) {
        LocalDate nextDate = date;
        do {
            nextDate = nextDate.plusDays(1);
        } while (!predicate.test(nextDate));
        return nextDate;
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextWorkingDay = next(today, w -> w.getDayOfWeek().getValue() < 6);
        System.out.println("Next working day: " + nextWorkingDay);
    }
}
