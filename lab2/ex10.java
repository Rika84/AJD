package pl_4.java.AJD.lab2;

public class ex10 {
    public static class TaskRunner {
        public static void runTogether(Runnable... tasks) {
            Thread[] threads = new Thread[tasks.length]; // Tworzymy tablicę wątków

            // Tworzymy i uruchamiamy oddzielny wątek dla każdego zadania
            for (int i = 0; i < tasks.length; i++) {
                threads[i] = new Thread(tasks[i]);
                threads[i].start();
            }

            // Czekamy na zakończenie wszystkich wątków
            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void runInOrder(Runnable... tasks) {
            // Wykonujemy wszystkie zadania w bieżącym wątku
            for (Runnable task : tasks) {
                task.run();
            }
        }
    }

    public static void main(String[] args) {
        // Przykładowe zadania
        Runnable task1 = () -> System.out.println("Zadanie 1");
        Runnable task2 = () -> System.out.println("Zadanie 2");
        Runnable task3 = () -> System.out.println("Zadanie 3");

        // Uruchamiamy wszystkie zadania równolegle
        System.out.println("Zadania równolegle: ");
        TaskRunner.runTogether(task1, task2, task3);

        // Uruchamiamy wszystkie zadania w kolejności
        System.out.println("Zadania w kolejności: ");
        TaskRunner.runInOrder(task1, task2, task3);
    }
}
