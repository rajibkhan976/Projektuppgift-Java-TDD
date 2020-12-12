package ec.java.tdd;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestConnectingFour {
    private ConnectingFour connectingFourApp;

    @Before
    public void setUp () {
        connectingFourApp = new ConnectingFour();
    }

    @Test
    public void testOneCheckHorizontalMatchForPlayerOne() {
        String[] boardCellValArr = {
                "O", "O", "O", "O", null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = false;
        assertTrue(expectedResult == connectingFourApp.checkHorizontalMatchForPlayerOne(boardCellValArr));
    }

    @Test
    public void testTwoCheckHorizontalMatchForPlayerOne() {
        String[] boardCellValArr = {
                null, null, null, null, "O", "O", "O",
                "O", null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = true;
        assertTrue(expectedResult == connectingFourApp.checkHorizontalMatchForPlayerOne(boardCellValArr));
    }

    @Test
    public void testOneCheckHorizontalMatchForPlayerTwo() {
        String[] boardCellValArr = {
                "X", "X", "X", "X", null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = false;
        assertTrue(expectedResult == connectingFourApp.checkHorizontalMatchForPlayerTwo(boardCellValArr));
    }

    @Test
    public void testTwoCheckHorizontalMatchForPlayerTwo() {
        String[] boardCellValArr = {
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, "X",
                "X", "X", "X", null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = true;
        assertTrue(expectedResult == connectingFourApp.checkHorizontalMatchForPlayerTwo(boardCellValArr));
    }

    @Test
    public void testOneCheckVerticalMatchForPlayerOne() {
        String[] boardCellValArr = {
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                "O", null, null, null, null, null, null,
                "O", null, null, null, null, null, null,
                "O", null, null, null, null, null, null,
                "O", null, null, null, null, null, null
        };
        boolean expectedResult = false;
        assertTrue(expectedResult == connectingFourApp.checkVerticalMatchForPlayerOne(boardCellValArr));
    }

    @Test
    public void testTwoCheckVerticalMatchForPlayerOne() {
        String[] boardCellValArr = {
                null, "O", null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                "O", null, null, null, null, null, null,
                "O", null, null, null, null, null, null,
                "O", null, null, null, null, null, null
        };
        boolean expectedResult = true;
        assertTrue(expectedResult == connectingFourApp.checkVerticalMatchForPlayerOne(boardCellValArr));
    }

    @Test
    public void testOneCheckVerticalMatchForPlayerTwo() {
        String[] boardCellValArr = {
                null, null, null, null, null, null, null,
                null, "X", null, null, null, null, null,
                null, "X", null, null, null, null, null,
                null, "X", null, null, null, null, null,
                null, "X", null, null, null, null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = false;
        assertTrue(expectedResult == connectingFourApp.checkVerticalMatchForPlayerTwo(boardCellValArr));
    }

    @Test
    public void testTwoCheckVerticalMatchForPlayerTwo() {
        String[] boardCellValArr = {
                null, null, null, "X", null, null, null,
                null, null, null, "X", null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, "X", null, null, null, null,
                null, null, "X", null, null, null, null
        };
        boolean expectedResult = true;
        assertTrue(expectedResult == connectingFourApp.checkVerticalMatchForPlayerOne(boardCellValArr));
    }

    @Test
    public void testOneCheckDiagonalMatchForPlayerOne() {
        String[] boardCellValArr = {
                null, null, null, null, null, null, null,
                null, "O", null, null, null, null, null,
                null, null, "O", null, null, null, null,
                null, null, null, "O", null, null, null,
                null, null, null, null, "O", null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = false;
        assertTrue(expectedResult == connectingFourApp.checkDiagonalMatchForPlayerOne(boardCellValArr));
    }

    @Test
    public void testTwoCheckDiagonalMatchForPlayerOne() {
        String[] boardCellValArr = {
                null, null, null, null, null, null, null,
                null, null, null, "O", null, null, null,
                null, null, "O", null, null, null, null,
                null, "O", null, null, null, null, null,
                "O", null, null, null, null, null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = true;
        assertTrue(expectedResult == connectingFourApp.checkDiagonalMatchForPlayerOne(boardCellValArr));
    }

    @Test
    public void testOneCheckDiagonalMatchForPlayerTwo() {
        String[] boardCellValArr = {
                null, null, null, null, null, null, null,
                null, "X", null, null, null, null, null,
                null, null, "X", null, null, null, null,
                null, null, null, "X", null, null, null,
                null, null, null, null, "X", null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = false;
        assertTrue(expectedResult == connectingFourApp.checkDiagonalMatchForPlayerTwo(boardCellValArr));
    }

    @Test
    public void testTwoCheckDiagonalMatchForPlayerTwo() {
        String[] boardCellValArr = {
                null, null, null, null, null, null, null,
                null, null, null, "X", null, null, null,
                null, null, "X", null, null, null, null,
                null, "X", null, null, null, null, null,
                "X", null, null, null, null, null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = true;
        assertTrue(expectedResult == connectingFourApp.checkDiagonalMatchForPlayerTwo(boardCellValArr));
    }

    @Test
    public void testOneCheckInverseDiagonalMatchForPlayerOne() {
        String[] boardCellValArr = {
                null, null, null, null, null, null, null,
                null, "O", null, null, null, null, null,
                null, null, "O", null, null, null, null,
                null, null, null, "O", null, null, null,
                null, null, null, null, "O", null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = true;
        assertTrue(expectedResult == connectingFourApp.checkInverseDiagonalMatchForPlayerOne(boardCellValArr));
    }

    @Test
    public void testTwoCheckInverseDiagonalMatchForPlayerOne() {
        String[] boardCellValArr = {
                null, null, null, null, null, null, null,
                null, null, null, "O", null, null, null,
                null, null, "O", null, null, null, null,
                null, "O", null, null, null, null, null,
                "O", null, null, null, null, null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = false;
        assertTrue(expectedResult == connectingFourApp.checkInverseDiagonalMatchForPlayerOne(boardCellValArr));
    }

    @Test
    public void testOneCheckInverseDiagonalMatchForPlayerTwo() {
        String[] boardCellValArr = {
                null, null, null, null, null, null, null,
                null, "X", null, null, null, null, null,
                null, null, "X", null, null, null, null,
                null, null, null, "X", null, null, null,
                null, null, null, null, "X", null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = true;
        assertTrue(expectedResult == connectingFourApp.checkInverseDiagonalMatchForPlayerTwo(boardCellValArr));
    }

    @Test
    public void testTwoCheckInverseDiagonalMatchForPlayerTwo() {
        String[] boardCellValArr = {
                null, null, null, null, null, null, null,
                null, null, null, "X", null, null, null,
                null, null, "X", null, null, null, null,
                null, "X", null, null, null, null, null,
                "X", null, null, null, null, null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = false;
        assertTrue(expectedResult == connectingFourApp.checkInverseDiagonalMatchForPlayerTwo(boardCellValArr));
    }

    @Test
    public void testOneCheckIfDrawn() {
        String[] boardCellValArr = {
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, "X", null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null,
                null, null, null, null, null, null, null
        };
        boolean expectedResult = true;
        assertTrue(expectedResult == connectingFourApp.checkIfDrawn(boardCellValArr));
    }

    @Test
    public void testTwoCheckIfDrawn() {
        String[] boardCellValArr = {
                "X", "O", "O", "O", "X", "O", "O",
                "X", "O", "O", "O", "O", "O", "X",
                "X", "X", "O", "X", "O", "O", "O",
                "X", "O", "X", "O", "O", "O", "O",
                "X", "X", "O", "O", "X", "O", "X",
                "O", "O", "O", "O", "O", "X", "O"
        };
        boolean expectedResult = false;
        assertTrue(expectedResult == connectingFourApp.checkIfDrawn(boardCellValArr));
    }
}
