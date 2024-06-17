package AJD.lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ex14 {

    public static void main(String[] args) {
        // Przykładowe dane wejściowe
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(7, 8, 9));
        Stream<ArrayList<Integer>> stream = Stream.of(list1, list2, list3);

        // 1. reduce(BinaryOperator<T> accumulator)
        ArrayList<Integer> result1 = stream.reduce((listA, listB) -> {
            listA.addAll(listB);
            return listA;
        }).orElse(new ArrayList<>());
        System.out.println("Result using reduce(BinaryOperator<T> accumulator): " + result1);

        // Odtwarzanie strumienia, ponieważ poprzedni został zamknięty
        stream = Stream.of(list1, list2, list3);

        // 2. reduce(T identity, BinaryOperator<T> accumulator)
        ArrayList<Integer> result2 = stream.reduce(new ArrayList<>(), (listA, listB) -> {
            listA.addAll(listB);
            return listA;
        });
        System.out.println("Result using reduce(T identity, BinaryOperator<T> accumulator): " + result2);

        // Odtwarzanie strumienia, ponieważ poprzedni został zamknięty
        stream = Stream.of(list1, list2, list3);

        // 3. reduce(U identity, BiFunction<U, ? super T, U> accumulator,
        // BinaryOperator<U> combiner)
        ArrayList<Integer> result3 = stream.reduce(new ArrayList<>(),
                (listA, listB) -> {
                    ArrayList<Integer> newList = new ArrayList<>(listA);
                    newList.addAll(listB);
                    return newList;
                },
                (listA, listB) -> {
                    ArrayList<Integer> newList = new ArrayList<>(listA);
                    newList.addAll(listB);
                    return newList;
                });
        System.out.println(
                "Result using reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner): "
                        + result3);
    }
}
