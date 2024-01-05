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


    public static final class Cases {
        public static final String[][] emptyBoard = {{}};
    }

}
