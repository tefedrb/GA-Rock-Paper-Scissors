import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        prompt();
    }

    public static void prompt(){
        // Here we will have the user choose 1v1 or 1vC
        // Collect user input
        Scanner prompt = new Scanner(System.in);
        System.out.println("Main Menu" + '\n' +
                        "=====" + '\n' +
                        "1. Type 'play' to play." + '\n' +
                        "2. Type 'history' to view your game history" + '\n' +
                        "3. Type 'quit' to stop playing."
                );
        String name = prompt.nextLine();
    }

    public void playGame(){
        // Start logic
        
    }

    public static void history(){

    }

    public static void quit(){

    }
}
