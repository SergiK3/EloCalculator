import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EloCalculator eloCalculator = new EloCalculator();

        System.out.println("Input number of Games below");
        eloCalculator.setNumberOfGames(scanner.nextInt());
        System.out.println("Input Winrate below");
        eloCalculator.setWinratePercentage(scanner.nextDouble());
        System.out.println("Input lp gain per game below");
        eloCalculator.setLpPerGame(scanner.nextInt());

        System.out.println("net gain in lp - " + eloCalculator.lpNet());
        System.out.println("how many divisions - " + eloCalculator.lpIntoDivision());
    }
}