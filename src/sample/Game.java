package sample;

public class Game {
    private Map map;
    private StateOfGame state;

    public Game() {
        map = new Map();
        state = StateOfGame.READY;
    }

    public void startGame() {
        if (state == StateOfGame.READY) {
            state = StateOfGame.RUNNING;
        }
        map.shuffle();
    }

    public void endGame() {
        if (state == StateOfGame.RUNNING) {
            state = StateOfGame.GAME_OVER;
            //field = null;  // unable to rewrite the new field if it's has a null in it
        }
    }

    public void resetGame() {
        if (state != StateOfGame.READY) {
            state = StateOfGame.READY;
            //field = null;
        }
    }

    public void nextMove(int code) {
        if (state == StateOfGame.RUNNING)
            map.toggleTiled(code);
        map.print();
        if (map.isWinner()) {
            System.out.println("You won!");
            endGame();
        }
    }

    public Map getMap() {
        return map;
    }
}
