public class Player {

    private String name;
    private int score;
    private int winningStreak;

    public Player(String name) {
        this.name = name;
        score = 0;
        winningStreak = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
    public int getWinningStreak() { return winningStreak; }
    public void incrementStreak() { winningStreak++; }
    public void setWinningStreak(int newStreak) { winningStreak = newStreak; }

    public void incrementScore() {
        score++;
    }

    public void reset() {
        score = 0;
    }
}