package RockPaperScissors;

public class Computer extends Player {
    private String currentChoice = null;
    private int winCounter = 0;

    public Computer(String str) {
        super(str);
    }

    public static void main(String[] args) {
//        collectChoice();
//        System.out.println(currentChoice);
    }

    public String getCurrentChoice() {
        return currentChoice;
    }

    public void collectChoice(){
        String[] responses = {"rock", "paper", "scissors"};
        int random2 = (int) (Math.random() * 3);
        System.out.println(random2);
        currentChoice = responses[random2];
    }
}
