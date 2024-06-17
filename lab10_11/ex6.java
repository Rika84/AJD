package AJD.lab10_11;

public class ex6 {
    public static boolean matchPattern(String input) {
        return input.matches("ab{3}.*");
    }

    public static void main(String[] args) {
        System.out.println(matchPattern("abbbxyz")); // true
        System.out.println(matchPattern("abbxyz")); // false
        System.out.println(matchPattern("abbbbxyz")); // true
    }
}
