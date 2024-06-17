package AJD.lab7;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.Spliterator;
import java.util.Spliterators;

public class ex13 {

    public static <T> Stream<T> zip(Stream<T> pierwszy, Stream<T> drugi) {
        Iterator<T> iter1 = pierwszy.iterator();
        Iterator<T> iter2 = drugi.iterator();

        Iterator<T> zippedIterator = new Iterator<T>() {
            private boolean switcher = true;

            @Override
            public boolean hasNext() {
                return iter1.hasNext() || iter2.hasNext();
            }

            @Override
            public T next() {
                if (switcher) {
                    switcher = false;
                    return iter1.hasNext() ? iter1.next() : null;
                } else {
                    switcher = true;
                    return iter2.hasNext() ? iter2.next() : null;
                }
            }
        };

        Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(zippedIterator, Spliterator.ORDERED);
        return StreamSupport.stream(spliterator, false);
    }

    public static void main(String[] args) {
        Stream<String> pierwszy = Stream.of("A", "B", "C");
        Stream<String> drugi = Stream.of("1", "2", "3", "4");

        Stream<String> zipped = zip(pierwszy, drugi);
        zipped.forEach(System.out::println);
    }
}
