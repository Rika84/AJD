package AJD.lab10_11;

public class ex14 {
    public static boolean containsPattern(String input) {
        return input.matches(".*\\b\\w+[z]\\w+\\b.*");
    }

    public static void main(String[] args) {
        System.out.println(containsPattern("This is a puzzle")); // true
        System.out.println(containsPattern("zebra")); // false
        System.out.println(containsPattern("amazing")); // true
    }
}
