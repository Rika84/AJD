import java.util.Iterator;

public class ex5 {
    public static Iterable<Integer> constant(final int value) {
        return new Iterable<Integer>() {
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    public boolean hasNext() {
                        return true; // Zawsze zwraca true, ponieważ ciąg jest nieskończony
                    }

                    public Integer next() {
                        return value; // Zwraca wartość ciągłą
                    }

                    public void remove() {
                        throw new UnsupportedOperationException("remove");
                    }
                };
            }
        };
    }

    // Przykładowe użycie:
    public static void main(String[] args) {
        Iterable<Integer> constantSequence = constant(1);
        Iterator<Integer> iterator = constantSequence.iterator();
        for (int i = 0; i < 5; i++) {
            System.out.println(iterator.next());
        }
    }
}
