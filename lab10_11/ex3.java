package AJD.lab10_11;

public class ex3 {
    public static boolean containsOnlyCertainChars(String input) {
        return input.matches("[a-zA-Z0-9]+");
    }

    public static void main(String[] args) {
        System.out.println(containsOnlyCertainChars("abcABC123")); // true
        System.out.println(containsOnlyCertainChars("abc!ABC123")); // false
    }
}
