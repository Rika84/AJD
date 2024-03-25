public class ex2 {
    public static void main(String[] args) {
        // Przykładowe użycie metody runTogether
        Runnable task1 = () -> System.out.println("Zadanie 1 wykonane w wątku: " + Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println("Zadanie 2 wykonane w wątku: " + Thread.currentThread().getName());
        Runnable task3 = () -> System.out.println("Zadanie 3 wykonane w wątku: " + Thread.currentThread().getName());

        runTogether(task1, task2, task3);

        // Przykładowe użycie metody runInOrder
        Runnable task4 = () -> System.out.println("Zadanie 4 wykonane w wątku: " + Thread.currentThread().getName());
        Runnable task5 = () -> System.out.println("Zadanie 5 wykonane w wątku: " + Thread.currentThread().getName());
        Runnable task6 = () -> System.out.println("Zadanie 6 wykonane w wątku: " + Thread.currentThread().getName());

        runInOrder(task4, task5, task6);
    }

    public static void runTogether(Runnable... tasks) {
        for (Runnable task : tasks) {
            Thread thread = new Thread(task);
            thread.start();
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }
}
