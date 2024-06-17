package AJD.lab10_11;

public class ex8 {
    public static boolean containsPattern(String input) {
        return input.matches(".*[a-z]+_[a-z]+.*");
    }

    public static void main(String[] args) {
        System.out.println(containsPattern("hello_world")); // true
        System.out.println(containsPattern("helloworld")); // false
    }
}
