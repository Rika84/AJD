package AJD.lab3;

import java.io.File;
import java.util.Arrays;

public class ex12 {

    public static void main(String[] args) {
        File dir = new File("D:\\kurs3_2\\pl_4");
        String extension = ".txt";
        String[] files = listFilesWithExtension(dir, extension);

        // Print the list of files
        if (files != null) {
            Arrays.stream(files).forEach(System.out::println);
        } else {
            System.out.println("Directory not found or no files with the specified extension.");
        }
    }

    public static String[] listFilesWithExtension(File dir, String extension) {
        if (dir.isDirectory()) {
            String[] fileList = dir.list((d, name) -> name.endsWith(extension));
            if (fileList != null && fileList.length > 0) {
                return fileList;
            }
        }
        return null;
    }
}
