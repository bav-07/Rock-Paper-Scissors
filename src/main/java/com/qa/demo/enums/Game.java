package com.qa.demo.enums;

import java.util.Random;

public class Game {

    // Random rand = new Random();
    // int r = rand.nextInt(3); // three equally likely numbers
    public static boolean flipCoin(CoinFlip prediction) {
        CoinFlip actual = null;

        double randNum = Math.random();

        if (randNum < 0.5) actual = CoinFlip.HEADS;
        else if (randNum < 0.99) actual = CoinFlip.TAILS;
        else actual = CoinFlip.EDGE;

        System.out.println("Prediction: " + prediction + ", Actual: " + actual);

        return prediction == actual;
    }

    public static Result jankenGame(RPS userChoice) {
        Random rand = new Random();
        int r = rand.nextInt(RPS.values().length);
        RPS cpuChoice = RPS.values()[r];
        if (!userChoice.equals(RPS.QUIT)) {
            System.out.println("CPU: " + cpuChoice + ", YOU: " + userChoice);
        }
        return (userChoice.getResult(cpuChoice));
    }

}
