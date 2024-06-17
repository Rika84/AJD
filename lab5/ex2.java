package AJD.lab5;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Arrays;

public class ex2 {

    public static void main(String[] args) {
        try {
            // Wczytaj plik do listy słów
            String content = new String(
                    Files.readAllBytes(Paths.get("D:\\kurs3_2\\pl_4\\java\\AJD\\lab5\\book-war-and-peace.txt")));
            List<String> words = Arrays.asList(content.split("\\PL+"));

            // Zliczanie długich słów przy użyciu stream
            long startTime = System.currentTimeMillis();
            long count = words.stream().filter(word -> word.length() > 12).count();
            long endTime = System.currentTimeMillis();
            System.out.println("Stream count: " + count + ", Time: " + (endTime - startTime) + " ms");

            // Zliczanie długich słów przy użyciu parallelStream
            startTime = System.currentTimeMillis();
            count = words.parallelStream().filter(word -> word.length() > 12).count();
            endTime = System.currentTimeMillis();
            System.out.println("ParallelStream count: " + count + ", Time: " + (endTime - startTime) + " ms");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
