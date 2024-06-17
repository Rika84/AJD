package AJD.lab10_11;

public class ex7 {
    public static boolean matchPattern(String input) {
        return input.matches("a(b{2,3})[^b]*");
    }

    public static void main(String[] args) {
        System.out.println(matchPattern("abbxyz")); // true
        System.out.println(matchPattern("abbbxyz")); // true
        System.out.println(matchPattern("abbbbxyz")); // false
    }
}
