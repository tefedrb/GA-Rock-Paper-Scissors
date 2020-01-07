package RockPaperScissors;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private String name = null;
    private String currentChoice = null;
    private int winCounter = 0;
    private int lossCounter = 0;
    private int tieCounter = 0;

    public Player(String str){
        this.name = str;
    }

    public String getCurrentChoice() {
        return currentChoice;
    }

    public void setCurrentChoice(String choice){
        this.currentChoice = choice;
    }

    public int getWinCounter(){
        return this.winCounter;
    }

    public int getLossCounter(){
        return this.lossCounter;
    }

    public int getTieCounter(){
        return this.tieCounter;
    }

    protected String addWin(){
        winCounter++;
        String win = this.name + " wins this round!";
        System.out.println(win);
        return win;
    }

    protected void addLoss(){
        this.lossCounter++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str){
        this.name = str;
    }

    protected String addDraw(){
        this.tieCounter++;
        String output = "It's a draw!";
        System.out.println(output);
        return output;
    }

    public void collectChoice() {
        System.out.println("It's " + this.name + "'s turn.");
        System.out.println("Type 'rock', 'paper', or 'scissors'");
        String[] choices = {"rock", "paper", "scissors"};
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        if (Arrays.asList(choices).contains(input)) {
            this.setCurrentChoice(input);
        } else {
            System.out.println("Please enter a valid input");
            collectChoice();
        }
    }

    public void getStats(){
        System.out.println(this.getName() + " wins: " + this.getWinCounter()
            + '\n' +
                " losses: " + this.getLossCounter()
                + '\n' +
                " ties: " + this.getTieCounter()
        );
    }
}
