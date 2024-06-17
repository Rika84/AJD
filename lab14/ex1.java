package AJD.lab14;

import java.time.LocalDate;
import java.time.chrono.ThaiBuddhistDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ex1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        // Formatowanie we Francji
        DateTimeFormatter franceFormatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy", Locale.FRANCE);
        System.out.println("Francja: " + now.format(franceFormatter));

        // Formatowanie w Chinach
        DateTimeFormatter chinaFormatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy", Locale.CHINA);
        System.out.println("Chiny: " + now.format(chinaFormatter));

        // Formatowanie w Tajlandii (z cyframi tajskimi)
        ThaiBuddhistDate thaiDate = ThaiBuddhistDate.now();
        DateTimeFormatter thaiFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd G", new Locale("th", "TH", "TH"));
        thaiFormatter = thaiFormatter.withLocale(new Locale("th", "TH", "TH-u-nu-thai"));
        System.out.println("Tajlandia: " + thaiDate.format(thaiFormatter));
    }
}
