package RockPaperScissors;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class History {
    private ArrayList<String[]> rounds = new ArrayList<String[]>(){};

    public void saveRound(String[] round){
        /* An array of strings - 0: player who won
            1: player1 choice
            2: player2 choice
            // Look at line 64 of game for when saveRound gets used
         */
        this.rounds.add(round);
    }

    public String returnHistory(String userIn) {
        userIn = userIn.toLowerCase();
        if (userIn.equals("history")){
                AtomicInteger roundNum = new AtomicInteger(1);
            this.rounds.forEach(round -> {
                System.out.println(round[0]);
                System.out.println("Round " + roundNum + ": " + round[1]);
                System.out.println("    1 chose: " + round[2]);
                System.out.println("    2 chose: " + round[3]);
                System.out.println("============================");
                roundNum.getAndIncrement();
            });
            System.out.println("HIT RETURN TO GO BACK TO MAIN MENU");
            return "loop";
        }
        return "No History";
    }
}
