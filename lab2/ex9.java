package pl_4.java.AJD.lab2;

public class ex9 {
    public static class Greeter implements Runnable {
        private String target;
        private int n;

        public Greeter(String target, int n) {
            this.target = target;
            this.n = n;
        }

        @Override
        public void run() {
            for (int i = 0; i < n; i++) {
                System.out.println("Witaj, " + target);
            }
        }
    }

    public static void main(String[] args) {
        // Tworzymy dwie instancje Greeter z różnymi komunikatami i uruchamiamy je
        // równolegle w dwóch wątkach
        Greeter greeter1 = new Greeter("świecie", 5);
        Greeter greeter2 = new Greeter("moja droga", 3);

        Thread thread1 = new Thread(greeter1);
        Thread thread2 = new Thread(greeter2);

        thread1.start();
        thread2.start();
    }
}
