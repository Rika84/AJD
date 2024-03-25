import java.io.File;
import java.io.FileFilter;

public class ex3 {
    public static void main(String[] args) {
        // Wyrażenie lambda
        File directory = new File("AJD");
        File[] subDirectoriesLambda = getSubDirectories(directory, file -> file.isDirectory());
        if (subDirectoriesLambda != null) {
            System.out.println("Podkatalogi (lambda):");
            printSubDirectories(subDirectoriesLambda);
        } else {
            System.out.println("Brak podkatalogów (lambda)");
        }

        // Anonimowa klasa wewnętrzna
        File[] subDirectoriesAnonymous = getSubDirectories(directory, new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (subDirectoriesAnonymous != null) {
            System.out.println("\nPodkatalogi (anonimowa klasa wewnętrzna):");
            printSubDirectories(subDirectoriesAnonymous);
        } else {
            System.out.println("Brak podkatalogów (anonimowa klasa wewnętrzna)");
        }
    }

    public static File[] getSubDirectories(File directory, FileFilter filter) {
        if (directory.exists() && directory.isDirectory()) {
            return directory.listFiles(filter);
        } else {
            System.out.println("Podany plik nie istnieje lub nie jest katalogiem.");
            return null;
        }
    }

    public static void printSubDirectories(File[] subDirectories) {
        for (File subDirectory : subDirectories) {
            System.out.println(subDirectory.getName());
        }
    }
}
