package AJD.lab10_11;

public class ex15 {
    public static boolean matchPattern(String input) {
        return input.matches("[a-zA-Z0-9_]+");
    }

    public static void main(String[] args) {
        System.out.println(matchPattern("Valid_string123")); // true
        System.out.println(matchPattern("Invalid-string!")); // false
    }
}
