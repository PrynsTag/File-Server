package server;

import java.util.ArrayList;

public class Command {
    private static final ArrayList<String> files = new ArrayList<>();

    public void add(String fileName) {
        if (!files.contains(fileName) && fileName.matches("file[1-9]|file10")) {
            files.add(fileName);
            System.out.printf("The file %s added successfully%n", fileName);
        } else {
            System.out.printf("Cannot add the file %s%n", fileName);
        }
    }

    public void get(String fileName) {
        if (files.contains(fileName)) {
            System.out.printf("The file %s was sent%n", fileName);
        } else {
            System.out.printf("The file %s not found%n", fileName);
        }
    }

    public void delete(String fileName) {
        if (files.contains(fileName)) {
            files.remove(fileName);
            System.out.printf("The file %s was deleted%n", fileName);
        } else {
            System.out.printf("The file %s not found%n", fileName);
        }
    }
}
