package RockPaperScissors;

import RockPaperScissors.Computer;

import java.util.Scanner;

public class Game {
    private static String mode = "";
    private static String navigation = "";

    public static void main(String[] args) {
        modeChoice(mode());

        Player player1 = new Player("Player 1");
        Player player2 = null;
        if(mode.equals("player")){
            player2 = new Player("Player 2");
        } else {
            player2 = new Computer("Computer");
        }

       prompt();
       checkNavigation();
       player1.collectChoice();
       player2.collectChoice();
       compare(player1, player2);
        // Players
        // User1 chooses
        // User2 chooses
        // Choices go into game logic playGame
    }

    public static int mode() {
        System.out.println("Type in number of players (2 max)");
        // Can abstract this bit of code away
        Scanner choice = new Scanner(System.in);
        int userin = choice.nextInt();
        if (userin != 1 && userin != 2) {
            System.out.println("Error: Input 1 or 2");
            mode();
        }
        return userin;
    }

    public static void modeChoice(int input) {
        if (input == 1 ) {
            mode = "computer";
        } else if (input == 2) {
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
        if(name.equals("play")){
            navigation = "play";
        } else if(name.equals("history")){
            navigation = "history";
        } else if(name.equals("quit")){
            navigation = "quit";
        }  else {
            System.out.println("Choose a valid input!");
            prompt();
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

    public static void checkNavigation(){
        if(navigation.equals("quit")){
            // quit
        } else if(navigation.equals("history")){
            // history
        }
    }

    public static void compare(Player player1, Player player2){
        // create a logic gate
        String p1 = player1.getCurrentChoice();
        String p2 = player2.getCurrentChoice();

        if(p1.equals(p2)){
            // tie
            player1.addTie();
        }

        if(p1.equals("scissors")){
            if(p2.equals("rock")){
                // player 1 loses
                player2.addWin();
                player1.addLoss();
            }
            if(p2.equals("paper")){
                // player 1 wins
                player1.addWin();
                player2.addLoss();
            }
        }
        if(p1.equals("rock")){
            if(p2.equals("scissors")){
                // player 1 wins
                player1.addWin();
                player2.addLoss();
            }
            if(p2.equals("paper")){
                // player 1 loses
                player2.addWin();
                player1.addLoss();
            }
        }
        if(p1.equals("paper")){
            if(p2.equals("rock")){
                // player 1 wins
                player1.addWin();
                player2.addLoss();
            }
            if(p2.equals("scissors")){
                // player 1 loses
                player2.addWin();
                player1.addLoss();
            }
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("We Here!!");
    }

    public void setMode(String str){
        this.mode = str;
    }

    public static void history () {

    }

    public static void quit () {

    }
}

