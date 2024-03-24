import java.math.BigInteger;
import java.util.Iterator;

public class ex6 {
    public static void main(String[] args) {
        Sequence<BigInteger> squareSequence = new SquareSequence();
        Iterator<BigInteger> iterator = squareSequence.iterator();
        for (int i = 0; i < 5; i++) {
            System.out.println(iterator.next());
        }
    }
}

interface Sequence<T> {
    Iterator<T> iterator();
}

class SquareSequence implements Sequence<BigInteger> {
    private BigInteger current = BigInteger.ZERO;

    public Iterator<BigInteger> iterator() {
        return new Iterator<BigInteger>() {
            public boolean hasNext() {
                return true; // Zawsze zwraca true, ponieważ ciąg jest nieskończony
            }

            public BigInteger next() {
                current = current.add(BigInteger.ONE);
                return current.multiply(current); // Zwraca kwadrat kolejnej liczby
            }

            public void remove() {
                throw new UnsupportedOperationException("remove");
            }
        };
    }
}
