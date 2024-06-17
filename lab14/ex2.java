package AJD.lab14;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        Set<Locale> locales = Arrays.stream(Locale.getAvailableLocales()).collect(Collectors.toSet());
        Set<Locale> nonWesternLocales = locales.stream()
                .filter(locale -> !isWesternNumerals(locale))
                .collect(Collectors.toSet());

        nonWesternLocales.forEach(locale -> System.out.println(locale + ": " + formatNumber(1234567890, locale)));
    }

    private static boolean isWesternNumerals(Locale locale) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
        char zeroDigit = symbols.getZeroDigit();
        return zeroDigit >= '0' && zeroDigit <= '9';
    }

    private static String formatNumber(long number, Locale locale) {
        DecimalFormat format = (DecimalFormat) DecimalFormat.getInstance(locale);
        return format.format(number);
    }
}
