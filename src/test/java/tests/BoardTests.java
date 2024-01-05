package tests;

import org.junit.Test;
import software.ulpgc.kata6.Board;

import static org.assertj.core.api.Assertions.assertThat;
import static tests.BoardTests.Cases.*;

public class BoardTests {
    @Test
    public void empty_board_should_return_empty_board(){
        String[][] state = new Board(emptyBoard).next().state();
        assertThat(state).isEqualTo(emptyBoard);
    }

    @Test
    public void all_dead_1x1_should_return_all_dead_1x1(){
        String[][] state = new Board(allDead1x1).next().state();
        assertThat(state).isEqualTo(allDead1x1);
    }

    @Test
    public void all_alive_1x1_should_return_all_dead_1x1(){
        String[][] state = new Board(allAlive1x1).next().state();
        assertThat(state).isEqualTo(allDead1x1);
    }


    public static final class Cases {
        private static final String DEAD = ".";
        private static final String ALIVE = "X";

        public static final String[][] emptyBoard = {{}};

        public static final String[][] allDead1x1 = {{DEAD}};
        public static final String[][] allAlive1x1 = {{ALIVE}};
    }

}
