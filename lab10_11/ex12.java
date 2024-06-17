package AJD.lab10_11;

public class ex12 {
    public static boolean matchPattern(String input, String word) {
        return input.matches(".*" + word + "[.,!?]?\\z");
    }

    public static void main(String[] args) {
        System.out.println(matchPattern("This is a test.", "test")); // true
        System.out.println(matchPattern("This is a test!", "test")); // true
        System.out.println(matchPattern("This is a test", "test")); // true
        System.out.println(matchPattern("This is a test,", "test")); // true
        System.out.println(matchPattern("This is a test;", "test")); // false
    }
}
