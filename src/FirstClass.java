public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String playerName = "Tim";
        int calculateScore = calculateHighScorePosition(1500);
        displayHighScorePosition(playerName, calculateScore);
        calculateScore = calculateHighScorePosition(1000);
        displayHighScorePosition(playerName, calculateScore);
        calculateScore = calculateHighScorePosition(500);
        displayHighScorePosition(playerName, calculateScore);
        calculateScore = calculateHighScorePosition(100);
        displayHighScorePosition(playerName, calculateScore);
        calculateScore = calculateHighScorePosition(25);
        displayHighScorePosition(playerName, calculateScore);

    }
    public static void displayHighScorePosition(String playerName, int score) {
        System.out.println(playerName + " managed to get into position " + score + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        if(score >= 1000)
            return 1;
        else if(score >= 500)
            return 2;
        else if (score >= 100)
            return 3;
        return 4;
    }
}
