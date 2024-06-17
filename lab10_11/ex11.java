package AJD.lab10_11;

public class ex11 {
    public static boolean matchPattern(String input, String word) {
        return input.matches(word + ".*");
    }

    public static void main(String[] args) {
        System.out.println(matchPattern("Test123", "Test")); // true
        System.out.println(matchPattern("123Test", "Test")); // false
    }
}
