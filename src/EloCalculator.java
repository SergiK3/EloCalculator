public class EloCalculator {


    private int numberOfGames;
    private final int averageTimePerGame = 36;
    private double winratePercentage;
    private int lpPerGame;

    public EloCalculator() {

    }

    public EloCalculator(int numberOfGames, double winratePercentage, int lpPerGame) {

        setNumberOfGames(numberOfGames);
        setWinratePercentage(winratePercentage);
        setLpPerGame(lpPerGame);
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        if (numberOfGames < 0) {
            throw new IllegalArgumentException("Cant be below zero");
        }
        this.numberOfGames = numberOfGames;
    }

    public double getWinratePercentage() {
        return winratePercentage;
    }

    public void setWinratePercentage(double winratePercentage) {
        if (winratePercentage < 0) {
            throw new IllegalArgumentException("Cant be below zero");
        }
        this.winratePercentage = winratePercentage;
    }

    public int getLpPerGame() {
        return lpPerGame;
    }

    public void setLpPerGame(int lpPerGame) {
        if (lpPerGame < 0) {
            throw new IllegalArgumentException("Cant be below zero");
        }
        this.lpPerGame = lpPerGame;
    }

    public int lpNet() {

        int wonLp = (int) (numberOfGames * (winratePercentage / 100) * lpPerGame);
        int lostLp = (int) (numberOfGames * ((100 - winratePercentage) / 100) * lpPerGame);

        return wonLp - lostLp;
    }

    public double lpIntoDivision() {
        return (double) this.lpNet() / 100;
    }

    @Override
    public String toString() {
        return "LeagueLPCalculator{" +
                "numberOfGames=" + numberOfGames +
                ", averageTimePerGame=" + averageTimePerGame +
                ", winratePercentage=" + winratePercentage +
                "%, lpPerGame=" + lpPerGame +
                '}';
    }

    // you subtract percentages first
    public int lpNetNew() {
        return (int) (numberOfGames * ((winratePercentage - (100 - winratePercentage)) / 100) * lpPerGame);
    }
}


