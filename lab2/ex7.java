package pl_4.java.AJD.lab2;

import java.util.Iterator;

public class ex7 {
    public static class DigitSequence implements Iterator<Integer> {
        private int number;

        public DigitSequence(int number) {
            this.number = number;
        }

        @Override
        public boolean hasNext() {
            // Sprawdzamy, czy liczba ma jeszcze cyfry do zwrócenia
            return number != 0;
        }

        @Override
        public Integer next() {
            // Zwracamy ostatnią cyfrę liczby
            int digit = number % 10;
            number /= 10;
            return digit;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public static void main(String[] args) {
        DigitSequence sequence = new DigitSequence(12345);
        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }
    }
}
