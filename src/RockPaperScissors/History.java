package RockPaperScissors;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class History {
    private ArrayList<String[]> rounds = new ArrayList<String[]>(){};

    public void saveRound(String win, String p1Choice, String p2Choice){
        String[] round = {win, p1Choice, p2Choice};
        rounds.add(round);
    }

    public void returnHistory(){
        AtomicInteger roundNum = new AtomicInteger(1);
        rounds.forEach(round ->{
            System.out.println(roundNum + ": " + round[0]);
            System.out.println(round[1]);
            System.out.println(round[2]);
            System.out.println("============================");
            roundNum.getAndIncrement();
        });
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
