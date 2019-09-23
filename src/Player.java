public class Player {
    private String name;
    private String currentChoice;
    private int winCounter;
    private int lossCounter;

    public String getCurrentChoice() {
        return currentChoice;
    }

    public void setCurrentChoice(String str){
        this.currentChoice = str;
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
