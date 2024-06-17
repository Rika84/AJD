package AJD.lab10_11;

public class ex9 {
    public static boolean containsPattern(String input) {
        return input.matches(".*[A-Z][a-z]+.*");
    }

    public static void main(String[] args) {
        System.out.println(containsPattern("Hello")); // true
        System.out.println(containsPattern("HELLO")); // false
    }
}
