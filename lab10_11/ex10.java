package AJD.lab10_11;

public class ex10 {
    public static boolean matchPattern(String input) {
        return input.matches("a.*b");
    }

    public static void main(String[] args) {
        System.out.println(matchPattern("aTestb")); // true
        System.out.println(matchPattern("Testb")); // false
    }
}
