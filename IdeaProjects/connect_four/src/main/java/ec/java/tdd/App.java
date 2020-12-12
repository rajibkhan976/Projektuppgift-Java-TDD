package ec.java.tdd;

import java.lang.String;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        ConnectingFour connectingFourGame = new ConnectingFour();
        System.out.println(connectingFourGame.initConnectingFour());
    }
}