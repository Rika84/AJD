package AJD.lab9;

import java.util.stream.Stream;

public class ex15 {

    public static void main(String[] args) {
        // Przykładowe dane wejściowe
        Stream<Double> doubleStream = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0);

        // Wywołanie reduce do obliczenia średniej
        AverageResult result = doubleStream.reduce(new AverageResult(0, 0),
                (acc, value) -> new AverageResult(acc.getSum() + value, acc.getCount() + 1),
                (acc1, acc2) -> new AverageResult(acc1.getSum() + acc2.getSum(), acc1.getCount() + acc2.getCount()));

        // Obliczenie średniej
        double average = result.getCount() > 0 ? result.getSum() / result.getCount() : 0;
        System.out.println("Średnia: " + average);
    }

    // Pomocnicza klasa do przechowywania sumy i liczby elementów
    static class AverageResult {
        private final double sum;
        private final long count;

        public AverageResult(double sum, long count) {
            this.sum = sum;
            this.count = count;
        }

        public double getSum() {
            return sum;
        }

        public long getCount() {
            return count;
        }
    }
}
