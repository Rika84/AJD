package AJD.lab13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ex2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Set<String> allZones = ZoneId.getAvailableZoneIds();

        allZones.stream()
                .map(ZoneId::of)
                .map(zoneId -> ZonedDateTime.of(now, zoneId))
                .forEach(zonedDateTime -> System.out
                        .println(zonedDateTime.getZone() + ": " + zonedDateTime.getOffset()));
    }
}
