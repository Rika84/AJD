package AJD.lab14;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class ex4 {
    public static void main(String[] args) {
        Locale[] locales = Locale.getAvailableLocales();
        Set<String> languages = new TreeSet<>();

        for (Locale locale : locales) {
            languages.add(locale.getDisplayLanguage(locale));
        }

        System.out.println("Available languages:");
        for (String language : languages) {
            System.out.println(language);
        }
    }
}
