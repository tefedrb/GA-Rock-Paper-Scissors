package RockPaperScissors;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private static String name = null;
    private static String currentChoice = null;
    private int winCounter = 0;
    private int lossCounter = 0;
    private int tieCounter = 0;

    public Player(String str){
        this.name = str;
    }

    public String getCurrentChoice() {
        return currentChoice;
    }

    public void setCurrentChoice(String str){
        this.currentChoice = str;
    }

    protected void addWin(){
        winCounter++;
    }

    protected void addLoss(){
        lossCounter++;
    }

    String getName() {
        return this.name;
    }

    void setName(String str){
        this.name = str;
    }

    protected void addTie(){
        this.tieCounter++;
    }

    public static void collectChoice() {
        System.out.println("It's " + name + "'s turn.");
        System.out.println("Type 'rock', 'paper', or 'scissors' to play.");
        String[] choices = {"rock", "paper", "scissors"};
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        if (Arrays.asList(choices).contains(input)) {
            currentChoice = input;
        } else {
            System.out.println("Please enter a valid input");
            collectChoice();
        }
    }
}
