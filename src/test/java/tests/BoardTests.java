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

    @Test
    public void all_dead_2x2_should_return_all_dead_2x2(){
        String[][] state = new Board(allDead2x2).next().state();
        assertThat(state).isEqualTo(allDead2x2);
    }

    @Test
    public void all_alive_2x2_should_return_all_alive_2x2(){
        String[][] state = new Board(allAlive2x2).next().state();
        assertThat(state).isEqualTo(allAlive2x2);
    }

    @Test
    public void triangle_2x2_should_return_all_alive_2x2(){
        String[][] state = new Board(triangle2x2).next().state();
        assertThat(state).isEqualTo(allAlive2x2);
    }

    @Test
    public void diagonal_2x2_should_return_all_dead_2x2(){
        String[][] state = new Board(diagonal2x2).next().state();
        assertThat(state).isEqualTo(allDead2x2);
    }


    public static final class Cases {
        private static final String DEAD = ".";
        private static final String ALIVE = "X";

        public static final String[][] emptyBoard = {{}};

        public static final String[][] allDead1x1 = {{DEAD}};
        public static final String[][] allAlive1x1 = {{ALIVE}};

        public static final String[][] allDead2x2 = {{DEAD, DEAD},
                                                     {DEAD, DEAD}};

        public static final String[][] allAlive2x2 = {{ALIVE, ALIVE},
                                                     {ALIVE, ALIVE}};

        public static final String[][] triangle2x2 = {{DEAD, ALIVE},
                                                      {ALIVE, ALIVE}};

        public static final String[][] diagonal2x2 = {{ALIVE, DEAD},
                                                      {DEAD, ALIVE}};

    }

}
