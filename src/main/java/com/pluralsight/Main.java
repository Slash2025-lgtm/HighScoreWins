package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the score name (Ex Home:Visitor|0:0): ");
        String Scoreboard = keyboard.nextLine().trim();

        String[] SplitUp = Scoreboard.split("[:, |]");
        int HomeTeamScore = Integer.parseInt(SplitUp[2]);
        int AwayTeamScore = Integer.parseInt(SplitUp[3]);

        if (HomeTeamScore > AwayTeamScore) {
            System.out.println(SplitUp[0] + " Has won");
        } else if (HomeTeamScore == AwayTeamScore) {
            System.out.println("Tie Game");
        } else {
            System.out.println(SplitUp[1] + " Has won");
        }
    }
}
