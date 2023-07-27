package com.qa.demo.enums;

public enum RPS {

    ROCK {
        @Override
        public Result getResult(RPS other) {
            if (other == PAPER) return Result.LOSS;
            else if (other == SCISSORS) return Result.WIN;
            else return Result.DRAW;
        }
    },
    PAPER {
        @Override
        public Result getResult(RPS other) {
            if (other == PAPER) return Result.DRAW;
            else if (other == SCISSORS) return Result.LOSS;
            else return Result.WIN;
        }
    },
    SCISSORS {
        @Override
        public Result getResult(RPS other) {
            if (other == PAPER) return Result.WIN;
            else if (other == SCISSORS) return Result.DRAW;
            else return Result.LOSS;
        }
    },
    QUIT {
        @Override
        public Result getResult(RPS other) {
            System.out.println("Goodbye!");
            return Result.QUIT;
        }
    };

    public abstract Result getResult(RPS other);
}
