package RockPaperScissors;

import RockPaperScissors.Computer;

import java.util.Scanner;

public class Game {
    private static String mode = "";
    private static String navigation = "";

    public static void main(String[] args) {
        History history = new History();
        modeChoice(mode());

        // Players
        Player player1 = new Player("Player 1");
        Player player2 = null;
        if(mode.equals("player")){
            player2 = new Player("Player 2");
        } else {
            player2 = new Computer("Computer");
        }

       prompt();
       checkNavigation();
        // User1 chooses
       player1.collectChoice();
        // User2 chooses
       player2.collectChoice();
       // Find winner
       findWinner(player1, player2);

    }

    public static int mode() {
        System.out.println("Type in number of players (2 max)");
        // Can abstract this bit of code away
        Scanner choice = new Scanner(System.in);
        int userIn = choice.nextInt();
        if (userIn != 1 && userIn != 2) {
            System.out.println("Error: Input 1 or 2");
            mode();
        }
        return userIn;
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


    public static void checkNavigation(){
        if(navigation.equals("quit")){
            // quit
        } else if(navigation.equals("history")){
            // history
        }
    }

    public static int compare(String p1, String p2){
        int toNum = 1;
        p1 = p1.toLowerCase();
        p2 = p2.toLowerCase();
        if((p1.equals("rock") && p2.equals("paper")) || (p1.equals("paper") && p2.equals("scissors")) || (p1.equals("scissors") && p2.equals("rock"))){
            toNum = 0;
        } else if(p1.equals(p2)){
            toNum = 2;
        }
        return toNum;
    }

    public static void findWinner(Player player1, Player player2){
        // create a logic gate
        String p1 = player1.getCurrentChoice();
        String p2 = player2.getCurrentChoice();
        int check = compare(p1, p2);
        if(check == 1){
            player1.addWin();
            player2.addLoss();
        } else if(check == 2){
            player1.addTie();
        } else if(check == 0){
            player1.addLoss();
            player2.addWin();
        }
        System.out.println(p1);
        System.out.println(p2);
    }

    public void setMode(String str){
        this.mode = str;
    }

    public static void history () {

    }

    public static void quit () {

    }
}

