package AJD.lab15;

import java.util.Locale;

public class ex11 {
    private static final String[] IMPERIAL_COUNTRIES = { "US", "CA", "LR", "MM" };

    public static void main(String[] args) {
        // Test the class with different locales
        displayPaperSizeForLocale(Locale.US);
        displayPaperSizeForLocale(Locale.CANADA);
        displayPaperSizeForLocale(Locale.UK);
        displayPaperSizeForLocale(new Locale("pl", "PL"));
    }

    public static void displayPaperSizeForLocale(Locale locale) {
        String country = locale.getCountry();
        String paperSize = isImperialCountry(country) ? "Letter: 8.5 x 11 inches" : "A4: 210 x 297 mm";

        System.out.println("Default paper size for " + locale.getDisplayCountry() + " (" + locale + "): " + paperSize);
    }

    private static boolean isImperialCountry(String countryCode) {
        for (String imperialCountry : IMPERIAL_COUNTRIES) {
            if (imperialCountry.equals(countryCode)) {
                return true;
            }
        }
        return false;
    }
}
