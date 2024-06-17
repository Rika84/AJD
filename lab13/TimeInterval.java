package AJD.lab13;

import java.time.LocalTime;

public class TimeInterval {
    private LocalTime start;
    private LocalTime end;

    public TimeInterval(LocalTime start, LocalTime end) {
        if (start.isAfter(end)) {
            throw new IllegalArgumentException("Start time must be before end time");
        }
        this.start = start;
        this.end = end;
    }

    public boolean overlaps(TimeInterval other) {
        return !this.end.isBefore(other.start) && !this.start.isAfter(other.end);
    }

    public static void main(String[] args) {
        TimeInterval interval1 = new TimeInterval(LocalTime.of(10, 0), LocalTime.of(11, 0));
        TimeInterval interval2 = new TimeInterval(LocalTime.of(10, 30), LocalTime.of(11, 30));
        TimeInterval interval3 = new TimeInterval(LocalTime.of(11, 30), LocalTime.of(12, 30));

        System.out.println(interval1.overlaps(interval2)); // true
        System.out.println(interval1.overlaps(interval3)); // false
    }
}
