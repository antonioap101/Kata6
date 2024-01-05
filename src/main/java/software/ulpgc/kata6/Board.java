package software.ulpgc.kata6;

public class Board {
    private final String[][] state;

    public Board(String[][] state) {
        this.state = state;
    }

    public Board next() {
        return new Board(state);
    }

    public String[][] state() {
        return state;
    }
}
