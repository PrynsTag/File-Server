package server;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Command command = new Command();

        while (true) {
            String action = scanner.next();
            if ("exit".equals(action)) break;
            String filename = scanner.next();

            switch (action) {
                case "add" -> command.add(filename);
                case "get" -> command.get(filename);
                case "delete" -> command.delete(filename);
            }
        }
    }
}

