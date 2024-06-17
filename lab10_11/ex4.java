package AJD.lab10_11;

public class ex4 {
    public static boolean matchPattern(String input) {
        return input.matches("ab*.*");
    }

    public static void main(String[] args) {
        System.out.println(matchPattern("abbbxyz")); // true
        System.out.println(matchPattern("axyz")); // true
        System.out.println(matchPattern("bxyz")); // false
    }
}
