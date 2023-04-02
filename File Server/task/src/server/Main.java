package server;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Command command = new Command();

        while (!scanner.hasNext("exit")) {
            String action = scanner.next();
            String filename = scanner.next();

            switch (action) {
                case "add" -> command.add(filename);
                case "get" -> command.get(filename);
                case "delete" -> command.delete(filename);
            }
        }
    }
}

