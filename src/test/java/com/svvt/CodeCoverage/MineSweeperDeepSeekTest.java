package com.svvt.CodeCoverage;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

public class MineSweeperDeepSeekTest {
    private MineSweeperDeepSeek mineSweeper;

    @Before
    public void setUp() {
        // Initialize myTruth and myShow arrays with specific values for testing
        mineSweeper = new MineSweeperDeepSeek();
        mineSweeper.myTruth = new int[][]{
            {0, 1, 0},
            {0, 0, 0},
            {0, 1, 0}
        };
        mineSweeper.myShow = new boolean[][]{
            {false, false, false},
            {false, false, false},
            {false, false, false}
        };
    }

    @Test
    public void testCellPicked() {
        // Test case where the cell is not a mine and has no adjacent mines
        mineSweeper.cellPicked(1, 1);
        assertTrue(mineSweeper.myShow[1][1]);
        assertTrue(mineSweeper.myShow[0][0]);
        assertTrue(mineSweeper.myShow[0][1]);
        assertTrue(mineSweeper.myShow[0][2]);
        assertTrue(mineSweeper.myShow[1][0]);
        assertTrue(mineSweeper.myShow[1][2]);
        assertTrue(mineSweeper.myShow[2][0]);
        assertTrue(mineSweeper.myShow[2][1]);
        assertTrue(mineSweeper.myShow[2][2]);

        // Test case where the cell is a mine
        mineSweeper.cellPicked(0, 1);
        assertTrue(mineSweeper.myShow[0][1]);

        // Test case where the cell is out of bounds
        mineSweeper.cellPicked(-1, -1);
        // No changes to myShow should occur for out-of-bounds cells

        // Test case where the cell has already been picked
        mineSweeper.cellPicked(1, 1);
        // No changes to myShow should occur for already picked cells
    }

    @Test
    public void testInBounds() {
        // Test case where the row and column are within the bounds
        assertTrue(mineSweeper.inBounds(0, 0));

        // Test case where the row is out of bounds
        assertFalse(mineSweeper.inBounds(-1, 0));

        // Test case where the column is out of bounds
        assertFalse(mineSweeper.inBounds(0, -1));

        // Test case where both the row and column are out of bounds
        assertFalse(mineSweeper.inBounds(-1, -1));

        // Test case where the row is within bounds but the column is out of bounds
        assertFalse(mineSweeper.inBounds(0, 3));

        // Test case where the column is within bounds but the row is out of bounds
        assertFalse(mineSweeper.inBounds(3, 0));
    }
}

