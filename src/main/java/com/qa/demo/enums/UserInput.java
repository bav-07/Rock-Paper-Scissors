package com.qa.demo.enums;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class UserInput implements Closeable {

    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public RPS getRPSChoice() {
        RPS userChoice = null;
        do {
            try {
                userChoice = RPS.valueOf(this.scanner.nextLine().trim().toUpperCase());
            } catch (Exception e) {
                System.out.println("Please enter a valid choice: ROCK, PAPER, SCISSORS");
            }
        } while(userChoice == null);
        return userChoice;
    }

    @Override
    public void close() throws IOException {
        scanner.close();
    }
}
