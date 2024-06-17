package AJD.lab13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class ex3 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Set<String> allZones = ZoneId.getAvailableZoneIds();

        Set<ZoneId> nonWholeHourOffsets = allZones.stream()
                .map(ZoneId::of)
                .map(zoneId -> ZonedDateTime.of(now, zoneId))
                .filter(zonedDateTime -> zonedDateTime.getOffset().getTotalSeconds() % 3600 != 0)
                .map(ZonedDateTime::getZone)
                .collect(Collectors.toSet());

        nonWholeHourOffsets.forEach(System.out::println);
    }
}
