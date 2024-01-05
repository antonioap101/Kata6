package software.ulpgc.kata6;

public class Board {
    private static final String DEAD = ".";
    private static final String ALIVE = "X";
    private final String[][] state;

    public Board(String[][] state) {
        this.state = state;
    }

    public Board next() {
        return new Board(calculate());
    }

    private String[][] calculate() {
        return (state.length > 0 && state[0].length > 0 && state[0][0].equals(ALIVE))? new String[][]{{DEAD}} : state;
    }

    public String[][] state() {
        return state;
    }
}
