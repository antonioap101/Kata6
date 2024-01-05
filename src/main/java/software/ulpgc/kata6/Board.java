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
        String[][] result = new String[rows()][columns()];
        for (int i = 0; i < rows(); i++) {
            for (int j = 0; j < columns(); j++) {
                result[i][j] = nextCellState(i,j);
            }

        }
        return result;

    }

    private String nextCellState(int row, int col) {
        boolean alive = isAlive(row, col);
        int neighbors = neighbors(row, col);

        return (alive && neighbors > 3 || neighbors < 2) ? DEAD :
                (!alive && neighbors == 3) ? ALIVE:
                        state[row][col];
    }

    private int neighbors(int row, int col) {
        int neighbors = 0;

        if (isAlive(row-1, col-1)) neighbors++;
        if (isAlive(row, col-1)) neighbors++;
        if (isAlive(row+1, col-1)) neighbors++;

        if (isAlive(row-1, col)) neighbors++;
        if (isAlive(row+1, col)) neighbors++;

        if (isAlive(row-1, col+1)) neighbors++;
        if (isAlive(row, col+1)) neighbors++;
        if (isAlive(row+1, col+1)) neighbors++;

        return neighbors;
    }

    private boolean isAlive(int row, int col) {
        return isInBounds(row, col) && state[row][col].equals(ALIVE);
    }

    private boolean isInBounds(int row, int col) {
        return row >= 0 && row < rows() && col >= 0 && col < columns();
    }

    private int rows() {
        return state.length;
    }

    private int columns() {
        return state[0].length;
    }

    public String[][] state() {
        return state;
    }
}
