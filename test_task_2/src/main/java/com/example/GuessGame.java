package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessGame {

    private static final int     MAX_ATTEMPTS = 7;
    private static       Scanner scanner      = new Scanner(System.in);

    public static void main(String args[]) {
        int attemptsCount = 1;
        int number = 1 + (int) (Math.random() * 100);

        System.out.println("Try to guess the number from 1 to 100...");

        int guess;
        do {
            if (attemptsCount > MAX_ATTEMPTS) {
                System.out.println("You have exceeded the number of attempts! The number was - " + number);
                break;
            }
            guess = getInt();
            attemptsCount++;
            if (guess > number) {
                System.out.println("too high...");
            } else if (guess < number) {
                System.out.println("too low...");
            } else {
                System.out.println("Correct!");
            }
        } while (guess != number);
    }

    private static int getInt() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Enter integer value!");
                scanner.nextLine();
            }
        }
    }
}

