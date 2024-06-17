package AJD.lab15;

import java.text.Normalizer;
import java.util.stream.IntStream;

public class UnicodeNormalization {
    public static void main(String[] args) {
        System.out.println("Characters normalized to multiple ASCII characters:");

        IntStream.range(0, Character.MAX_CODE_POINT)
                .filter(Character::isValidCodePoint)
                .mapToObj(Character::toChars)
                .map(String::new)
                .filter(UnicodeNormalization::isExpandedInNormalization)
                .forEach(UnicodeNormalization::printCharacter);
    }

    private static boolean isExpandedInNormalization(String character) {
        String normalizedKC = Normalizer.normalize(character, Normalizer.Form.NFKC);
        String normalizedKD = Normalizer.normalize(character, Normalizer.Form.NFKD);

        // Check if the normalized strings have more than one character and are ASCII
        return (normalizedKC.length() > 1 && containsOnlyAscii(normalizedKC)) ||
                (normalizedKD.length() > 1 && containsOnlyAscii(normalizedKD));
    }

    private static boolean containsOnlyAscii(String str) {
        return str.chars().allMatch(c -> c < 128);
    }

    private static void printCharacter(String character) {
        System.out.println("Character: " + character + " | Code Point: " + (int) character.charAt(0) + " | NFKC: " +
                Normalizer.normalize(character, Normalizer.Form.NFKC) + " | NFKD: " +
                Normalizer.normalize(character, Normalizer.Form.NFKD));
    }
}
