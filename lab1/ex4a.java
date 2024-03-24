interface IntSequence {
    boolean hasNext();

    int next();

    static IntSequence of(int... values) {
        return new IntSequence() {
            private int index = 0;

            public boolean hasNext() {
                return index < values.length;
            }

            public int next() {
                if (!hasNext()) {
                    throw new IllegalStateException("No more elements");
                }
                return values[index++];
            }
        };
    }
}

public class ex4a implements IntSequence {
    private int[] sequence;
    private int index;

    public ex4a(int... sequence) {
        this.sequence = sequence;
        index = 0;
    }

    public boolean hasNext() {
        return index < sequence.length;
    }

    public int next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements");
        }
        return sequence[index++];
    }

    public static void main(String[] args) {
        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }
    }
}
