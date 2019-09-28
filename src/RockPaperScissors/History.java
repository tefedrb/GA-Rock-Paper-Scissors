package RockPaperScissors;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class History {
    private ArrayList<String[]> rounds = new ArrayList<String[]>(){};

    public void saveRound(String[] round){
        this.rounds.add(round);
    }

    public void returnHistory(String userIn) {
        userIn = userIn.toLowerCase();
        if (userIn.equals("history")){
                AtomicInteger roundNum = new AtomicInteger(1);
            this.rounds.forEach(round -> {
                System.out.println(roundNum + ": " + round[0]);
                System.out.println(round[1]);
                System.out.println(round[2]);
                System.out.println("============================");
                roundNum.getAndIncrement();
            });
        }
    }

//    public void setRoundNum(int num){
//        this.roundNum = num;
//    }
//
//    public int getRoundNum(){
//        return this.roundNum;
//    }
//
//    public void incrementRoundNum(){
//        this.roundNum ++;
//    }
}
