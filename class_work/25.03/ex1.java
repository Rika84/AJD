public class ex1 {
    private static int globalVariable = 1; // Zmienna globalna

    public static void main(String[] args) {
        Thread incrementThread = new Thread(new IncrementTask());
        Thread decrementThread = new Thread(new DecrementTask());

        incrementThread.start();
        decrementThread.start();

        try {
            Thread.sleep(10000); // Czekaj 10 sekund
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        incrementThread.interrupt(); // Przerwij wątek inkrementacji
        decrementThread.interrupt(); // Przerwij wątek dekrementacji

        // Poczekaj na zakończenie obu wątków
        try {
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wyświetl wartość zmiennej globalnej
        System.out.println("Wartość zmiennej globalnej po 10 sekundach: " + globalVariable);
    }

    static class IncrementTask implements Runnable {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                globalVariable++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class DecrementTask implements Runnable {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                globalVariable--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
