package AJD.lab10_11;

public class ex5 {
    public static boolean matchPattern(String input) {
        return input.matches("ab+.*");
    }

    public static void main(String[] args) {
        System.out.println(matchPattern("abxyz")); // true
        System.out.println(matchPattern("aabxyz")); // true
        System.out.println(matchPattern("axyz")); // false
    }
}
