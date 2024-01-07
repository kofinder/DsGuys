package design_patterns.template_method;

abstract class Game {

    protected int currentPlayer;

    protected final int numberOfPlayer;

    protected abstract int getWinningPlayer();

    protected abstract void takeTurn();

    protected abstract boolean haveWinner();

    protected abstract void start();

    public Game(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public void run() {
        start();
        while (!haveWinner()) {
            takeTurn();
            System.out.println("Player " + getWinningPlayer() + " wins");
        }
    }
}

class Chess extends Game {
    private int maxTruns = 10;
    private int turn = 1;

    public Chess() {
        super(2);
    }

    @Override
    protected int getWinningPlayer() {
        return 0;
    }

    @Override
    protected void takeTurn() {
        System.out.println("trun " + (turn++) + "taken by player " + currentPlayer);
        currentPlayer = (currentPlayer + 1) % numberOfPlayer;
    }

    @Override
    protected boolean haveWinner() {
        return turn == maxTruns;
    }

    @Override
    protected void start() {
        System.out.println("Starting a game of chess.");
    }

}

public class GameDemo {
    public static void main(String[] args) {
        // skeleton
        new Chess().run();
    }
}
