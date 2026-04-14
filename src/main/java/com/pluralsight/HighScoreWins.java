package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score: ");
        String userInput = scanner.nextLine();

        String[] namesScoreSplit = userInput.split(Pattern.quote("|"));
        String[] namesSplits = namesScoreSplit[0].split(":");
        String home = namesSplits[0];
        String visitor = namesSplits[1];

        String[] scores = namesScoreSplit[1].split(":");
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        if (homeScore > visitorScore) {
            System.out.println("Winner : " + home);
        } else /* visitorScore > homeScore */{
            System.out.println("Winner : " + visitor);
        }



    }
}