package ec.java.tdd;

import java.lang.String;

import java.util.Random;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        ConnectingFour connectingFourGame = new ConnectingFour();
        boolean playAnotherRound = true;
        Scanner playAgain = new Scanner(System.in);
        while (playAnotherRound) {
            Random randomStart = new Random();
            if ((randomStart.nextInt((2 - 1) + 1) + 1) == 1) {
                System.out.println("\nThe player who choose O for yellow will start the game.\n");
            } else {
                System.out.println("\nThe player who choose X for red will start the game.\n");
            }
            System.out.println(connectingFourGame.initConnectingFour());
            System.out.println("\n If you want to play again then please press y,\n otherwise press n:");
            String playersOpinion = playAgain.nextLine();
            if (playersOpinion.equalsIgnoreCase("n")) {
                if (connectingFourGame.getPlayerOneWinCounter() > connectingFourGame.getPlayerTwoWinCounter()) {
                    System.out.println("\nPlayer one win the game:)");
                } else if (connectingFourGame.getPlayerOneWinCounter() == connectingFourGame.getPlayerTwoWinCounter()) {
                    System.out.println("\nMatch drawn.");
                } else {
                    System.out.println("\nPlayer two won the game:)");
                }
                playAnotherRound = false;
            }
        }
    }
}