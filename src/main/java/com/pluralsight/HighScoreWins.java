package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        String userInput;
        String home;
        String visitor;
        int homeScore;
        int visitorScore;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score: ");
        userInput = scanner.nextLine();

        String[] namesScoreSplit = userInput.split(Pattern.quote("|"));
        String[] namesSplits = namesScoreSplit[0].split(":");
        home = namesSplits[0];
        visitor = namesSplits[1];

        String[] scores = namesScoreSplit[1].split(":");
        homeScore = Integer.parseInt(scores[0]);
        visitorScore = Integer.parseInt(scores[1]);

        if (homeScore > visitorScore) {
            System.out.println("Winner : " + home);
        } else /* visitorScore > homeScore */{
            System.out.println("Winner : " + visitor);
        }



    }
}