public class Player {
    private String name;
    private String currentChoice;
    private int winCounter;
    private int lossCounter;

    public String getCurrentChoice() {
        return currentChoice;
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
}
