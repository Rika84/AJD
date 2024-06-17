package AJD.lab14;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;

public class ex3 {
    public static void main(String[] args) {
        Locale usLocale = new Locale("en", "US");
        SimpleDateFormat usDateFormat = (SimpleDateFormat) SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT,
                usLocale);
        String usPattern = usDateFormat.toPattern();

        System.out.println("Locales with the same date format as the US (" + usPattern + "):");
        Arrays.stream(Locale.getAvailableLocales())
                .filter(locale -> {
                    try {
                        SimpleDateFormat dateFormat = (SimpleDateFormat) SimpleDateFormat
                                .getDateInstance(SimpleDateFormat.SHORT, locale);
                        return dateFormat.toPattern().equals(usPattern);
                    } catch (Exception e) {
                        return false;
                    }
                })
                .forEach(locale -> System.out.println(locale.getDisplayName()));
    }
}
