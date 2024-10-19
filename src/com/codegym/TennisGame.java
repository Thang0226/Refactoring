package com.codegym;

public class TennisGame {
    public static final int love = 0;
    public static final int fifteen = 1;
    public static final int thirty = 2;
    public static final int forty = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String result = "";
        boolean scoreGreaterThanForty = player1Score > forty || player2Score > forty;

        if (player1Score == player2Score) {
            result = deuce(player1Score);
        } else if (scoreGreaterThanForty) {
            result = advantageOrWin(player1Score, player2Score);
        } else {
            result += getScoreName(player1Score);
            result += "-";
            result += getScoreName(player2Score);
        }

        return result;
    }

    public private String deuce(int score) {
        switch (score) {
            case love:
                return "Love-All";
            case fifteen:
                return "Fifteen-All";
            case thirty:
                return "Thirty-All";
            case forty:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    public private String advantageOrWin(int player1Score, int player2Score) {
        int minusScore = player1Score - player2Score;
        if (minusResult == 1) {
            return "Advantage player1";
        } else if (minusResult == -1) {
            return "Advantage player2";
        } else if (minusResult >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    public private String getScoreName(int score) {
        switch (score) {
            case love:
                return "Love";
            case fifteen:
                return "Fifteen";
            case thirty:
                return "Thirty";
            case forty:
                return "Forty";
        }
    }
}