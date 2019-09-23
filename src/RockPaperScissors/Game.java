package RockPaperScissors;

import RockPaperScissors.Computer;

import java.util.Scanner;

public class Game {
    private static String mode = "";
    private static String navigation = "";

    public static void main(String[] args) {
        modeChoice(mode());

        Player player1 = new Player();
        if(mode.equals("player")){
            Player player2 = new Player();
        } else {
            Player player2 = new Computer();
        }

        prompt();

        // Players
        // User1 chooses
        // User2 chooses
        // Choices go into game logic playGame
    }

    public static String mode() {
        System.out.println("Type in number of players (2 max)");
        // Can abstract this bit of code away
        Scanner choice = new Scanner(System.in);
        String userin = choice.nextLine();
        if (!userin.equals("1") || !userin.equals("2")) {
            System.out.println("Error: Input 1 or 2");
            mode();
        }
        return userin;
    }

    public static void modeChoice(String str) {
        if (str.equals("1")) {
            mode = "computer";
        } else if (str.equals("2")) {
            mode = "player";
        }
    }

    public static void prompt() {
        // Here we will have the user choose 1v1 or 1vC
        // Collect user input
        Scanner prompt = new Scanner(System.in);
        System.out.println("Main Menu" + '\n' +
                "=====" + '\n' +
                "1. Type 'play' to play." + '\n' +
                "2. Type 'history' to view your game history" + '\n' +
                "3. Type 'quit' to stop playing."
        );
        String name = prompt.nextLine().toLowerCase();
        if(!name.equals("play") || !name.equals("history") || !name.equals("quit")){
            System.out.println("Choose a valid input");
            prompt();
        }
        if(name.equals("play")){
            navigation = "play";
        } else if(name.equals("history")){
            navigation = "history";
        } else if(name.equals("quit")){
            navigation = "quit";
        }
    }

    public void playGame() {
        // Start logic
        // Writing out game logic
        // if user input
        // if computer input
        // collect user / computer inputs in map
        Scanner scan = new Scanner(System.in);
        String firstIn = scan.nextLine().toLowerCase();

    }

    public void checkNavigation(){
        if(this.navigation.equals("quit")){
            // quit
        } else if(this.navigation.equals("history")){
            // history
        }
    }

    public void setMode(String str){
        this.mode = str;
    }

    public static void history () {

    }

    public static void quit () {

    }
}

