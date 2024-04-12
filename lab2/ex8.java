package pl_4.java.AJD.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ex8 {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("orange");
        strings.add("grape");

        Comparator<String> comp = Comparator.naturalOrder(); // Ustawiamy porządek naturalny

        System.out.println("Przed luckySort:");
        System.out.println(strings);

        luckySort(strings, comp);

        System.out.println("Po luckySort:");
        System.out.println(strings);
    }

    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while (!isSorted(strings, comp)) { // Dopóki lista nie jest posortowana
            Collections.shuffle(strings); // Tasujemy elementy
        }
    }

    public static boolean isSorted(ArrayList<String> strings, Comparator<String> comp) {
        for (int i = 0; i < strings.size() - 1; i++) {
            // Jeśli sąsiadujące elementy nie są w odpowiedniej kolejności, lista nie jest
            // posortowana
            if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}
