package RockPaperScissors;

import java.util.Scanner;

public class Player {
    private String name = "Player 1";
    private String currentChoice;
    private int winCounter;
    private int lossCounter;

    public Player(){

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

    public String collectChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type 'rock', 'paper', or 'scissors' to play.");
        String[] choices = {"rock", "paper", "scissors"};
        String input = scan.nextLine().toLowerCase();
        for(int i = 0; i < choices.length; i++){
            if(!input.equals(choices[i])){
                System.out.println("Please choose a valid input.");
                this.collectChoice();
            }
        }
        return input;
    }

}
