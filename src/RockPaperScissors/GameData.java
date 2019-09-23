package RockPaperScissors;

public class GameData {
    private static String currentGameMode = "player";

    public static void setCurrentGameMode(String str){
        currentGameMode = str;
    }

    public GameData(String currentGameMode){
        this.currentGameMode = currentGameMode;
    }
}
