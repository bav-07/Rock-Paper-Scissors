package com.qa.demo.enums;

import java.io.IOError;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
//        LocalDate bday = LocalDate.of(1994, Month.APRIL,4);
//        System.out.println(bday);
//
//        for (int i = 0; i < CoinFlip.values().length; i++) {
//            System.out.println("I: " + CoinFlip.values()[i]);
//        }
//
//        for (int i = 0; i < 20; i++) {
//            Game.flipCoin(CoinFlip.EDGE);
//        }
        try (UserInput input = new UserInput(new Scanner(System.in));) {
            int wins = 0;
            int losses = 0;
            int draws = 0;
            Result result = null;
            do {
                if (wins + losses + draws > 10) {
                    System.out.println("Choose your option: ROCK, PAPER, SCISSORS. (Type QUIT to end game, or keep playing)");
                } else {
                    System.out.println("Choose your option: ROCK, PAPER, SCISSORS.");
                }
                result = Game.jankenGame(input.getRPSChoice());
                if (result.equals(Result.WIN)) wins++;
                if (result.equals(Result.LOSS)) losses++;
                if (result.equals(Result.DRAW)) draws++;
                System.out.println(result);
            } while (!result.equals(Result.QUIT));
            System.out.println("Wins: " + wins + "\nLosses: " + losses + "\nDraws: " + draws);

        } catch (IOException e) {
            System.out.println("Failed to create scanner: " + e.getMessage());
        }

//        System.out.println(RPS.ROCK instanceof RPS);

    }

}
