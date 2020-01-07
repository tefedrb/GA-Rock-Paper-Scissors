package RockPaperScissors;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        History history = new History();
        startSession(history);
    }

    public static void startSession(History history){
        // Players
        // Player One always gets created
        Player player1 = new Player("Player 1");
        // Player two can be human or computer, so start with null
        Player player2 = null;
        String mode = modeChoice(mode());
        // Then have a conditional check what mode was chosen by user
        // Have the the second player assigned to be a computer or another human
        if(mode.equals("player")){
            player2 = new Player("Player 2");
        } else {
            player2 = new Computer("Computer");
        }
        playGame(history, player1, player2);
    }

    public static String modeChoice(int input) {
        String mode = null;
        if (input == 1 ) {
            mode = "computer";
        } else if (input == 2) {
            mode = "player";
        }
        return mode;
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

    public static void playGame(History history, Player player1, Player player2){
        // This right here needs to be refactored - mainMenu shouldn't return anything
        mainMenu(history, player1, player2);
        //  history.returnHistory();
        System.out.println("\n");
        // User1 chooses
        player1.collectChoice();
        // User2 chooses
        player2.collectChoice();
        // Find & Save winner
        history.saveRound(findWinner(player1, player2));
        playGame(history, player1, player2);
    }

    public static void mainMenu(History history, Player player, Player player2) {
        // Here we will have the user choose 1v1 or 1vC
        // Collect user input
        Scanner mainMenu = new Scanner(System.in);
        System.out.println("Main Menu" + '\n' +
                "=====" + '\n' +
                "1. Type 'play' to play." + '\n' +
                "2. Type 'stats' to view stats." + '\n' +
                "3. Type 'history' to view your game history" + '\n' +
                "4. Type 'quit' to stop playing."
        );
        String name = mainMenu.nextLine().toLowerCase();
        if(name.equals("play")){

        } else if(name.equals("history")){
            System.out.println(" ");
            history.returnHistory("history");
            mainMenu.nextLine();
            mainMenu(history, player, player2);
        } else if(name.equals("quit")){
            System.exit(0);
        } else if(name.equals("stats")){
            player.getStats();
            player2.getStats();
            System.out.println("HIT RETURN TO GO BACK TO MAIN MENU");
            mainMenu.nextLine();
            mainMenu(history, player, player2);
        } else {
            System.out.println("BAD INPUT!");
            mainMenu(history, player, player2);
        }
    }

    public static int compareChoices(String p1, String p2){
        int toNum = 1;
        p1 = p1.toLowerCase();
        p2 = p2.toLowerCase();
        if((p1.equals("rock") && p2.equals("paper")) ||
                (p1.equals("paper") && p2.equals("scissors")) ||
                (p1.equals("scissors") && p2.equals("rock")))
        {
            toNum = 0;
        } else if(p1.equals(p2)){
            toNum = 2;
        }
        return toNum;
    }

    public static String[] findWinner(Player player1, Player player2){
        String p1Choice = player1.getCurrentChoice();
        String p2Choice = player2.getCurrentChoice();
        int check = compareChoices(p1Choice, p2Choice);
        /*
            The size and order of elements in this array corresponds to how we are
            formatting our returnHistory method (each array is a saved round)
         */
        String[] output = new String[4];
        String player1Name = player1.getName();
        String player2Name = player2.getName();
        output[0] = "< " + player1Name + " vs " + player2Name + " >";
        System.out.println(" ");
        if(check == 1){
            output[1] = player1.addWin();
            player2.addLoss();
        } else if(check == 2){
            output[1] = player1.addDraw();;
        } else if(check == 0){
            output[1] = player2.addWin();
            player1.addLoss();
        }
        output[2] = p1Choice;
        output[3] = p2Choice;
        System.out.println(" ");
        System.out.println(player1.getName() + " chose: " + p1Choice);
        System.out.println(player2.getName() + " chose: " + p2Choice);
        System.out.println("============================");
        Scanner pause = new Scanner(System.in);
        System.out.println("HIT ENTER TO CONTINUE");
        pause.nextLine();
        System.out.println("\n");
        return output;
    }
}

