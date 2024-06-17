package AJD.lab8;

import java.util.*;
import java.util.stream.*;

public class ex1 {

    public static void main(String[] args) {
        // Przykładowe dane wejściowe
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "eggplant", "fig", "grape");

        // (a) Obliczanie średniej z listy liczb całkowitych
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Średnia: " + average);

        // (b) Konwertowanie listy łańcuchów znaków na listę, w której wszystkie
        // łańcuchy zapisane są wielkimi literami oraz na listę, w której wszystkie
        // łańcuchy zapisane są małymi literami
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        List<String> lowerCaseStrings = strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Wielkie litery: " + upperCaseStrings);
        System.out.println("Małe litery: " + lowerCaseStrings);

        // (c) Obliczanie sumy wszystkich parzystych i nieparzystych liczb z listy
        int evenSum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        int oddSum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Suma parzystych: " + evenSum);
        System.out.println("Suma nieparzystych: " + oddSum);

        // (d) Usuwanie wszystkich zduplikowanych elementów z listy
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unikalne liczby: " + uniqueNumbers);

        // (e) Zliczanie liczby łańcuchów znaków na liście zaczynających się określoną
        // literą
        char startingLetter = 'a';
        long countStartingWithLetter = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();
        System.out.println("Liczba łańcuchów zaczynających się na " + startingLetter + ": " + countStartingWithLetter);

        // (f) Sortowanie listy łańcuchów znaków w kolejności alfabetycznej, rosnąco i
        // malejąco
        List<String> sortedStringsAscending = strings.stream()
                .sorted()
                .collect(Collectors.toList());
        List<String> sortedStringsDescending = strings.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sortowanie rosnąco: " + sortedStringsAscending);
        System.out.println("Sortowanie malejąco: " + sortedStringsDescending);

        // (g) Znajdowanie maksymalnej i minimalnej wartości na liście liczb całkowitych
        int maxNumber = numbers.stream()
                .max(Integer::compare)
                .orElseThrow(NoSuchElementException::new);
        int minNumber = numbers.stream()
                .min(Integer::compare)
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Maksymalna liczba: " + maxNumber);
        System.out.println("Minimalna liczba: " + minNumber);

        // (h) Znajdowanie drugiej najmniejszej i drugiej największej wartości na liście
        // liczb całkowitych
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        int secondSmallest = sortedNumbers.size() > 1 ? sortedNumbers.get(1) : null;
        int secondLargest = sortedNumbers.size() > 1 ? sortedNumbers.get(sortedNumbers.size() - 2) : null;
        System.out.println("Druga najmniejsza liczba: " + secondSmallest);
        System.out.println("Druga największa liczba: " + secondLargest);
    }
}
