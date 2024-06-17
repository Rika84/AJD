package AJD.lab6;

public class ex6 {

    // Metoda sprawdzająca, czy ciąg znaków jest złożony wyłącznie z liter
    public static boolean isAlphabetic(String input) {
        return input.codePoints().allMatch(Character::isAlphabetic);
    }

    // Metoda sprawdzająca, czy ciąg znaków jest poprawnym identyfikatorem języka
    public static boolean isJavaIdentifier(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        int firstCodePoint = input.codePointAt(0);
        if (!Character.isJavaIdentifierStart(firstCodePoint)) {
            return false;
        }
        return input.codePoints().allMatch(Character::isJavaIdentifierPart);
    }

    public static void main(String[] args) {
        // Testowanie metody isAlphabetic
        String testString1 = "abcde";
        String testString2 = "abc123";
        System.out.println("Is '" + testString1 + "' alphabetic? " + isAlphabetic(testString1)); // true
        System.out.println("Is '" + testString2 + "' alphabetic? " + isAlphabetic(testString2)); // false

        // Testowanie metody isJavaIdentifier
        String testString3 = "validIdentifier";
        String testString4 = "123invalidIdentifier";
        System.out.println("Is '" + testString3 + "' a valid Java identifier? " + isJavaIdentifier(testString3)); // true
        System.out.println("Is '" + testString4 + "' a valid Java identifier? " + isJavaIdentifier(testString4)); // false
    }
}
